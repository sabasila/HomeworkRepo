package JavaFx1;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class Controller2 {

    @FXML
    private AnchorPane anchorPane;

    public void changeBackground() {
        Random random = new Random();

        int red = random.nextInt(256);    // 0–255
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        String style = String.format("-fx-background-color: rgb(%d, %d, %d);", red, green, blue);
        anchorPane.setStyle(style);
    }
}
