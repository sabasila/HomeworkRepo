package JavaFx2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class Controller21 {

    @FXML
    private Button clickButton;

    private int clickCount = 0;

    public void handleClick() {
        clickCount++;

        if (clickCount == 5) {

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Are you sure you want to exit?");
            alert.setContentText("Click OK to exit or Cancel to stay.");

            alert.showAndWait().ifPresent(response -> {
                if (response.getText().equals("OK")) {
                    // აპლიკაციის გამორთვა
                    System.exit(0);
                }
            });
        }
    }
}
