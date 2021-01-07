package application;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton laugBtn;

    @FXML
    private JFXButton loveBtn;

    @FXML
    private JFXButton angrBtn;

    @FXML
    private AnchorPane emojiPane;

    @FXML
    private Label headerLabel;

    @FXML
    private Label messageLabel;

    @FXML
    private JFXButton emojiBtn;

    @FXML
    private ImageView emojiImage;

    @FXML
    void initialize() {
    	//ScaleTransition scaleTransition=
    	scaleTransition(.1, emojiPane, -1, -1);
    	
    	loveBtn.setOnAction(e1->{
    		
    		loveBtn.setDisable(true);
      		angrBtn.setDisable(true);
      		laugBtn.setDisable(true);
    		
    		showEmoji("/images/love.png", " #ff42b6", "love uhh", "sdfsdf");
    		
    	});
          angrBtn.setOnAction(e1->{
        	  loveBtn.setDisable(true);
        		angrBtn.setDisable(true);
        		laugBtn.setDisable(true);
    		
    		showEmoji("/images/angry.png", "  #e71515", "angry uhh", "sdfsdf");
    		
    	});
          laugBtn.setOnAction(e1->{
        	  loveBtn.setDisable(true);
        		angrBtn.setDisable(true);
        		laugBtn.setDisable(true);
	
	         showEmoji("/images/luagh.png", "  #00a47b", "luagh uhh", "sdfsdf");
	
           });
          
          emojiBtn.setOnAction(e1->{
        	  
        	 // ScaleTransition scaleTransition1=
        	  scaleTransition(.5, emojiPane, -1, -1);
        	  
        	  //FadeTransition fadeTransition=
        	  fadeTransition(.1, emojiPane, 1, 0);
        	  loveBtn.setDisable(false);
      		angrBtn.setDisable(false);
      		laugBtn.setDisable(false);
          });

    }
    
    private void showEmoji(String 	imageSrc,String color,String header,String message) {
    	
    	//ScaleTransition scaleTransition=
    			scaleTransition(.5, emojiPane, 1, 1);
    	
    	//FadeTransition fadeTransition2=
    			fadeTransition(.5, emojiPane, 0, 1);
    	emojiImage.setImage(new Image(imageSrc));
    	headerLabel.setText(header);
    	messageLabel.setText(message);
    	headerLabel.setStyle("-fx-text-fill:"+color+";");
    	emojiBtn.setStyle("-fx-background-color:"+color+";");
    	
		
	}
    
    public ScaleTransition scaleTransition(double duration,Node node,double byX,double byY) {
		ScaleTransition scala1=new ScaleTransition(Duration.seconds(duration),node);
		scala1.setByX(byX);
		scala1.setByY(byY);
		scala1.play();
		return scala1;
    	
    }
    
    public FadeTransition fadeTransition(double duration,Node node,double from,double to) {
    	
    	FadeTransition fdFadeTransition=new FadeTransition(Duration.seconds(duration),node);
    		fdFadeTransition.setFromValue(from);
    		fdFadeTransition.setToValue(to);
    		fdFadeTransition.play();
    		return fdFadeTransition;
    	
    }
}
