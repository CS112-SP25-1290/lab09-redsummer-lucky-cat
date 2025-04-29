package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {

  @FXML
  public ImageView imageView;

   @FXML
   public Label locationLabel;

   @FXML
   public Label dateLabel;

   @FXML
   public Label descriptionLabel;

   @FXML
   public Label revisedDescriptionLabel;

   @FXML
   public Hyperlink hyperlinkReference;

   @FXML
   public Button closeButton;

   public void handleCloseButton(){
       Stage stage = (Stage)imageView.getScene().getWindow();
       stage.close();

   }

   public void initData(Constants.Event eventIndex){
       String[] data = Constants.HISTORICAL_DATA[eventIndex.ordinal()];
       RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
       imageView.setImage(event.getImage());
       locationLabel.setText(event.getLocation());
       dateLabel.setText(event.getEventDay().toString());
       descriptionLabel.setText(event.getDescription());
       revisedDescriptionLabel.setText(event.getRevisedDescription());
       hyperlinkReference.setText(event.getCitation());
   }




   @FXML
    public void handleClose(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
   }

}
