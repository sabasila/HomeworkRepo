package JavaFx1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class Controller3 {

    @FXML
    private Button clickButton;

    @FXML
    private AnchorPane anchorPane;

    public void moveButton() {
        Random random = new Random();

        // ეკრანის შემთხვევითი კოორდინატები
        double maxX = anchorPane.getWidth() - clickButton.getWidth();
        double maxY = anchorPane.getHeight() - clickButton.getHeight();

        double randomX = random.nextDouble() * maxX;
        double randomY = random.nextDouble() * maxY;

        clickButton.setLayoutX(randomX);
        clickButton.setLayoutY(randomY);
    }
}
