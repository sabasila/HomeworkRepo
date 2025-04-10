package JavaFx2;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller22 {

    private Stage stage;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button switchToYellowButton;

    @FXML
    private Button switchToRedButton;

    @FXML
    private Button switchToGreenButton;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void switchToYellow() {
        switchScene("Yellow Scene", "yellow", "Go Back", "JavaFx2/scene2.fxml");
    }

    public void switchToRed() {
        switchScene("Red Scene", "red", "Go Back", "JavaFx2/scene3.fxml");
    }

    public void switchToGreen() {
        switchScene("Green Scene", "green", "Go Back", "JavaFx2/scene4.fxml");
    }

    public void goBackToMainScene() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JavaFx2/scene1.fxml"));
            stage.setScene(new Scene(root, 400, 400));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void switchScene(String title, String color, String goBackText, String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Scene scene = new Scene(root, 400, 400);
            scene.setFill(javafx.scene.paint.Color.valueOf(color));
            stage.setTitle(title);

            // Go Back button functionality for each scene
            Button goBackButton = new Button(goBackText);
            goBackButton.setLayoutX(150);
            goBackButton.setLayoutY(250);
            goBackButton.setOnAction(e -> goBackToMainScene());
            ((AnchorPane) root).getChildren().add(goBackButton);

            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
