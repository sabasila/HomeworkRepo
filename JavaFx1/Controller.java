package JavaFx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;

    private double moveAmount = 10;

    private Color[] colors = {Color.RED, Color.BLACK, Color.GREEN, Color.BLUE};
    private int colorIndex = 0;

    public void moveUp() {
        circle.setCenterY(circle.getCenterY() - moveAmount);
    }

    public void moveDown() {
        circle.setCenterY(circle.getCenterY() + moveAmount);
    }

    public void moveLeft() {
        circle.setCenterX(circle.getCenterX() - moveAmount);
    }

    public void moveRight() {
        circle.setCenterX(circle.getCenterX() + moveAmount);
    }

    // დიაგონალები
    public void moveUpLeft() {
        moveUp();
        moveLeft();
    }

    public void moveUpRight() {
        moveUp();
        moveRight();
    }

    public void moveDownLeft() {
        moveDown();
        moveLeft();
    }

    public void moveDownRight() {
        moveDown();
        moveRight();
    }

    public void setRed() {
        circle.setFill(Color.RED);
    }

    public void changeColor() {
        colorIndex = (colorIndex + 1) % colors.length;
        circle.setFill(colors[colorIndex]);
    }

    public void changeBackground(ActionEvent actionEvent) {

    }
}
