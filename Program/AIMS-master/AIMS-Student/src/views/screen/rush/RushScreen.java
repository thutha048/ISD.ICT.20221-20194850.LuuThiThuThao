package views.screen.rush;

import views.screen.rush.*;

import java.awt.Button;
import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import utils.Configs;
import views.screen.BaseScreenHandler;

public class RushScreen extends BaseScreenHandler {

	public RushScreen(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	ImageView logo;
	
	@FXML 
	Label pageTitle;
	
	@FXML 
	Label expectedTime;
	
	@FXML 
	Label note;
	
	@FXML
	Button btnConfirm;
	
}
