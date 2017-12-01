package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Controller implements Initializable{

	  @FXML
	    private ImageView img_logo;
	  
	  @FXML
	    private JFXButton btn_signin;

	   @FXML
	    private JFXButton btn_logout;
	   
	   @FXML
	    private Pane pane1;

	    @FXML
	    private Pane pane2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//Rotate image
		RotateTransition trans = new RotateTransition(Duration.seconds(25), img_logo);
		trans.setByAngle(3600);
		trans.play();
		
		translate(0.1f, pane2, 1200);
		
		btn_signin.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				translate(0.5f, pane2, -1200);
			}
		});
		
		btn_logout.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				translate(0.5f, pane2, 1200);
			}
		});
		
		
	}
	
	public void translate(float duration, Node n, int t) {
		TranslateTransition trans = new TranslateTransition(Duration.seconds(duration), n);
		trans.setByY(t);
		trans.play();
	}

	   

}
