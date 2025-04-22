package JavaFx4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {
    @FXML private ImageView imageView;
    @FXML private Button prevButton;
    @FXML private Button nextButton;

    private final Image[] images = new Image[10];
    private int currentIndex = 0;

    @FXML
    public void initialize() {
        for (int i = 0; i < 10; i++) {
            images[i] = new Image(getClass().getResourceAsStream("/MziuriHW/images/saba" + i + ".jpg"));
        }
        updateImage();
    }

    @FXML
    public void onNext() {
        if (currentIndex < images.length - 1) {
            currentIndex++;
            updateImage();
        }
    }

    @FXML
    public void onPrev() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImage();
        }
    }

    private void updateImage() {
        imageView.setImage(images[currentIndex]);
        prevButton.setDisable(currentIndex == 0);
        nextButton.setDisable(currentIndex == images.length - 1);
    }
}
