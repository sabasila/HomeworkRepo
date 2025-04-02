import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class davalebaui extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTBLUE);

        // ა 1
        Text text = new Text("გამარჯობა ეს არის აპლიკაცია");
        text.setFont(Font.font(24));
        text.setFill(Color.DARKBLUE);
        text.setX(150);
        text.setY(300);
        root.getChildren().add(text);
        stage.setResizable(false);
        Image icon = new Image("saba.png");
        stage.getIcons().add(icon);

        //  2
        Rectangle square = new Rectangle(100, 100, 100, 100);
        square.setFill(Color.GREEN);
        root.getChildren().add(square);
        Line diagonal1 = new Line(100, 100, 200, 200);
        Line diagonal2 = new Line(200, 100, 100, 200);
        diagonal1.setStroke(Color.YELLOW);
        diagonal2.setStroke(Color.YELLOW);
        root.getChildren().addAll(diagonal1, diagonal2);
        Rectangle rectangle = new Rectangle(300, 200, 200, 300);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLUE);
        rectangle.setStrokeWidth(3);
        root.getChildren().add(rectangle);
        Line line1 = new Line(300, 200, 500, 200);
        Line line2 = new Line(500, 200, 500, 500);
        Line line3 = new Line(500, 500, 300, 500);
        Line line4 = new Line(300, 500, 300, 200);
        line1.setStroke(Color.BLUE);
        line2.setStroke(Color.BLUE);
        line3.setStroke(Color.BLUE);
        line4.setStroke(Color.BLUE);
        root.getChildren().addAll(line1, line2, line3, line4);

        // 3
        Circle face = new Circle(450, 100, 50);
        face.setFill(Color.YELLOW);
        Circle eye1 = new Circle(435, 85, 5);
        Circle eye2 = new Circle(465, 85, 5);
        eye1.setFill(Color.BLACK);
        eye2.setFill(Color.BLACK);
        Line mouth = new Line(435, 115, 465, 115);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(3);
        root.getChildren().addAll(face, eye1, eye2, mouth);
        stage.setTitle("Davalebaui");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
