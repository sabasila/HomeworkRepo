package JavaFx6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label resultLabel;

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "1234";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty()) {
            resultLabel.setText("გთხოვთ შეავსოთ Username.");
        } else if (password.isEmpty()) {
            resultLabel.setText("გთხოვთ შეავსოთ Password.");
        } else if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            resultLabel.setText("თქვენ წარმატებით შეიყვანეთ მონაცემები!");
        } else {
            resultLabel.setText("არასწორი Username ან Password.");
        }
    }
}
