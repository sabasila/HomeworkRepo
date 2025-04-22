package JavaFx4;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class GreetingController {
    @FXML private CheckBox balloonsCheck;
    @FXML private CheckBox heartsCheck;
    @FXML private CheckBox starsCheck;
    @FXML private FlowPane cardPane;

    private final Image balloonsImg = new Image("/greeting/balloons.png");
    private final Image heartsImg = new Image("/greeting/hearts.png");
    private final Image starsImg = new Image("/greeting/stars.png");

    @FXML
    public void generateCard() {
        cardPane.getChildren().clear();

        if (balloonsCheck.isSelected()) addImages(balloonsImg);
        if (heartsCheck.isSelected()) addImages(heartsImg);
        if (starsCheck.isSelected()) addImages(starsImg);
    }

    private void addImages(Image img) {
        for (int i = 0; i < 5; i++) {
            ImageView iv = new ImageView(img);
            iv.setFitHeight(50);
            iv.setFitWidth(50);
            cardPane.getChildren().add(iv);
        }
    }
}
