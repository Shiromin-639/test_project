package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 350, 300);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"), 100, 100));
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
