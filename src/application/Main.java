package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
		public void start(Stage primaryStage) {
			try {
				
				Scene scene = new Scene(FXMLLoader.load(getClass().getResource("menuPage.fxml")));
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Four Circle Game");
				primaryStage.setScene(scene);
				primaryStage.show();
				primaryStage.setMaximized(true);
				
			} catch(Exception e) {
				e.printStackTrace();
				}
			}

	public static void main(String[] args) {
		launch(args);
		
	}
}
