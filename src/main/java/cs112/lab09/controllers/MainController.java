package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {

    @FXML
    public Button startButton;

    @FXML
    public Button quitButton;

    @FXML
    public Label titleLabel;

    @FXML
    public Label subtitleLabel;

    @FXML
    public Label descriptionLabel;

    @FXML
    public ImageView imageLabel;

    @FXML
    public void initialize() {
        titleLabel.setText(MAIN_VIEW_TITLE);
        subtitleLabel.setText(MAIN_SUBTITLE);
        descriptionLabel.setText(MAIN_DESCRIPTION);
        Image image = new Image(REDSUMMER_IMAGE_PATH);
        imageLabel.setImage(image);


    }
     @FXML
    public void handleStart() throws IOException {
         Stage stage = (Stage)titleLabel.getScene().getWindow();
         FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(MAP_VIEW_RESOURCE));
         Scene scene = new Scene(fxmlLoader.load());
         stage.setScene(scene);
         stage.setTitle(MAP_VIEW_TITLE);
         stage.show();
    }

    @FXML
    public void handleQuit() {
        System.exit(0);
    }

}