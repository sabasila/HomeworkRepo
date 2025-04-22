package JavaFx4;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PetController {

    @FXML private RadioButton catRadio;
    @FXML private RadioButton dogRadio;
    @FXML private RadioButton bunnyRadio;
    @FXML private RadioButton birdRadio;
    @FXML private TextField nameField;
    @FXML private Label resultLabel;
    @FXML private ToggleGroup petGroup;

    @FXML
    public void onConfirm() {
        String petType = "";
        if (catRadio.isSelected()) petType = "კატა";
        else if (dogRadio.isSelected()) petType = "ძაღლი";
        else if (bunnyRadio.isSelected()) petType = "კურდღელი";
        else if (birdRadio.isSelected()) petType = "ჩიტი";

        String name = nameField.getText().trim();

        if (!petType.isEmpty() && !name.isEmpty()) {
            resultLabel.setText("შენ აირჩიე " + petType + " სახელად " + name);
        } else {
            resultLabel.setText("გთხოვ აირჩიე ცხოველი და მიუთითე სახელი.");
        }
    }
}
