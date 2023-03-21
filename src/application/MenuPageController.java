package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuPageController {
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnExit;
	
	@FXML
	public void actionPlay(ActionEvent e) {
		try {
			Stage stage;
			stage = (Stage) btnPlay.getScene().getWindow();
			stage.close();
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("game.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle("Four Circle Game");
			secondaryStage.setScene(scene);
			secondaryStage.show();
			secondaryStage.setMaximized(true);
		} catch(Exception e1) {
			e1.printStackTrace();
			}
	}
	
	@FXML 
	public void actionExit() {
		Platform.exit();
		System.exit(0);
	}	
}
	


	

