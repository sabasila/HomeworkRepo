package JavaFx5;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import java.util.Map;
public class CurrencyController
{

    @FXML private ChoiceBox<String> fromCurrency;
    @FXML private ChoiceBox<String> toCurrency;
    @FXML private Spinner<Double> amountSpinner;
    @FXML private Label resultLabel;

    private final Map<String, Double> rates = Map.of(
            "GEL", 1.0,
            "USD", 2.6,
            "EUR", 2.8,
            "GBP", 3.0
    );

    @FXML
    public void initialize() {

        String[] currencies = {"GEL", "USD", "GBP", "EUR"};
        fromCurrency.getItems().addAll(currencies);
        toCurrency.getItems().addAll(currencies);
        fromCurrency.setValue("GEL");
        toCurrency.setValue("USD");

        amountSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 100000.0, 1.0, 1.0));

        fromCurrency.setOnAction(e -> convert());
        toCurrency.setOnAction(e -> convert());
        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> convert());

        convert();
    }

    private void convert() {
        String from = fromCurrency.getValue();
        String to = toCurrency.getValue();
        double amount = amountSpinner.getValue();

        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            resultLabel.setText("არასწორი ვალუტა");
            return;
        }

        double result = (amount * rates.get(from)) / rates.get(to);
        resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, from, result, to));
    }
}
