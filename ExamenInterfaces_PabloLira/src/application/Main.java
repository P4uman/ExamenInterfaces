package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
private Stage stage;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			stage = primaryStage;
			startWindow();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void startWindow() throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("main_window.fxml"));
		
		AnchorPane root = loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().addAll(Main.class.getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
}
