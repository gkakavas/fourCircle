package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import application.Game;

public class GameController implements Initializable  {
	// Buttons
	@FXML
	private Button hitCol0;
	@FXML
	private Button hitCol1;
	@FXML
	private Button hitCol2;
	@FXML
	private Button hitCol3;
	@FXML
	private Button hitCol4;
	@FXML
	private Button hitCol5;
	@FXML
	private Button hitCol6;
	@FXML
	private Button hitCol7;
	@FXML
	private Button hitCol8;
	@FXML
	private Button hitCol9;
	@FXML
	private Button hitCol10;
	@FXML
	private Button hitCol11;
	@FXML 
	private Label player;
	
	@FXML
	protected Circle circleA0;
	@FXML
    protected Circle circleA1;
	@FXML
	protected Circle circleA2;
	@FXML
	protected Circle circleA3;
	@FXML
	protected Circle circleA4; 
	@FXML
	protected Circle circleA5;
	@FXML
	protected Circle circleA6; 
	@FXML
	protected Circle circleA7;
	
	@FXML
	protected Circle circleB0;
	@FXML
	protected Circle circleB1;
	@FXML
	protected Circle circleB2;
	@FXML
	protected Circle circleB3;
	@FXML
	protected Circle circleB4;
	@FXML
	protected Circle circleB5;
	@FXML
	protected Circle circleB6;
	@FXML
	protected Circle circleB7;

	@FXML
	protected Circle circleC0;
	@FXML
	protected Circle circleC1;
	@FXML
	protected Circle circleC2;
	@FXML
	protected Circle circleC3;
	@FXML
	protected Circle circleC4;
	@FXML
	protected Circle circleC5;
	@FXML
	protected Circle circleC6;
	@FXML
	protected Circle circleC7;

	@FXML
	protected Circle circleD0;
	@FXML
	protected Circle circleD1;
	@FXML
	protected Circle circleD2;
	@FXML
	protected Circle circleD3;
	@FXML
	protected Circle circleD4;
	@FXML
	protected Circle circleD5;
	@FXML
	protected Circle circleD6;
	@FXML
	protected Circle circleD7;

	@FXML
	protected Circle circleE0;
	@FXML
	protected Circle circleE1;
	@FXML
	protected Circle circleE2;
	@FXML
	protected Circle circleE3;
	@FXML
	protected Circle circleE4;
	@FXML
	protected Circle circleE5;
	@FXML
	protected Circle circleE6;
	@FXML
	protected Circle circleE7;

	@FXML
	protected Circle circleF0;
	@FXML
	protected Circle circleF1;
	@FXML
	protected Circle circleF2;
	@FXML
	protected Circle circleF3;
	@FXML
	protected Circle circleF4;
	@FXML
	protected Circle circleF5;
	@FXML
	protected Circle circleF6;
	@FXML
	protected Circle circleF7;

	@FXML
	protected Circle circleG0;
	@FXML
	protected Circle circleG1;
	@FXML
	protected Circle circleG2;
	@FXML
	protected Circle circleG3;
	@FXML
	protected Circle circleG4;
	@FXML
	protected Circle circleG5;
	@FXML
	protected Circle circleG6;
	@FXML
	protected Circle circleG7;

	@FXML
	protected Circle circleH0;
	@FXML
	protected Circle circleH1;
	@FXML
	protected Circle circleH2;
	@FXML
	protected Circle circleH3;
	@FXML
	protected Circle circleH4;
	@FXML
	protected Circle circleH5;
	@FXML
	protected Circle circleH6;
	@FXML
	protected Circle circleH7;

	@FXML
	protected Circle circleI0;
	@FXML
	protected Circle circleI1;
	@FXML
	protected Circle circleI2;
	@FXML
	protected Circle circleI3;
	@FXML
	protected Circle circleI4;
	@FXML
	protected Circle circleI5;
	@FXML
	protected Circle circleI6;
	@FXML
	protected Circle circleI7;

	@FXML
	protected Circle circleJ0;
	@FXML
	protected Circle circleJ1;
	@FXML
	protected Circle circleJ2;
	@FXML
	protected Circle circleJ3;
	@FXML
	protected Circle circleJ4;
	@FXML
	protected Circle circleJ5;
	@FXML
	protected Circle circleJ6;
	@FXML
	protected Circle circleJ7;

	@FXML
	protected Circle circleK0;
	@FXML
	protected Circle circleK1;
	@FXML
	protected Circle circleK2;
	@FXML
	protected Circle circleK3;
	@FXML
	protected Circle circleK4;
	@FXML
	protected Circle circleK5;
	@FXML
	protected Circle circleK6;
	@FXML
	protected Circle circleK7;

	@FXML
	protected Circle circleM0;
	@FXML
	protected Circle circleM1;
	@FXML
	protected Circle circleM2;
	@FXML
	protected Circle circleM3;
	@FXML
	protected Circle circleM4;
	@FXML
	protected Circle circleM5;
	@FXML
	protected Circle circleM6;
	@FXML
	protected Circle circleM7;
	@FXML
	protected  Button back;
	
	
	
	static ObservableList<Circle> obslist0 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist1 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist2 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist3 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist4 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist5 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist6 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist7 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist8 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist9 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist10 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslist11 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH0 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH1 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH2 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH3 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH4 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH5 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH6 = FXCollections.observableArrayList();
	static ObservableList<Circle> obslistH7 = FXCollections.observableArrayList();
	static ObservableList<ObservableList<Circle>> obsListH =  FXCollections.observableArrayList();
	static ObservableList<ObservableList<Circle>> obsList =  FXCollections.observableArrayList();
	Game game = new Game();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	obslist0.addAll(circleA0,circleA1,circleA2,circleA3,circleA4,circleA5,circleA6,circleA7);
	obslist1.addAll(circleB0,circleB1,circleB2,circleB3,circleB4,circleB5,circleB6,circleB7);
	obslist2.addAll(circleC0,circleC1,circleC2,circleC3,circleC4,circleC5,circleC6,circleC7);
	obslist3.addAll(circleD0,circleD1,circleD2,circleD3,circleD4,circleD5,circleD6,circleD7);
	obslist4.addAll(circleE0,circleE1,circleE2,circleE3,circleE4,circleE5,circleE6,circleE7);
	obslist5.addAll(circleF0,circleF1,circleF2,circleF3,circleF4,circleF5,circleF6,circleF7);
	obslist6.addAll(circleG0,circleG1,circleG2,circleG3,circleG4,circleG5,circleG6,circleG7);
	obslist7.addAll(circleH0,circleH1,circleH2,circleH3,circleH4,circleH5,circleH6,circleH7);
	obslist8.addAll(circleI0,circleI1,circleI2,circleI3,circleI4,circleI5,circleI6,circleI7);
	obslist9.addAll(circleJ0,circleJ1,circleJ2,circleJ3,circleJ4,circleJ5,circleJ6,circleJ7);
	obslist10.addAll(circleK0,circleK1,circleK2,circleK3,circleK4,circleK5,circleK6,circleK7);
	obslist11.addAll(circleM0,circleM1,circleM2,circleM3,circleM4,circleM5,circleM6,circleM7);
	obslistH0.addAll(circleA0,circleB0,circleC0,circleD0,circleE0,circleF0,circleG0,circleH0,circleI0,circleJ0,circleK0,circleM0);
	obslistH1.addAll(circleA1,circleB1,circleC1,circleD1,circleE1,circleF1,circleG1,circleH1,circleI1,circleJ1,circleK1,circleM1);
	obslistH2.addAll(circleA2,circleB2,circleC2,circleD2,circleE2,circleF2,circleG2,circleH2,circleI2,circleJ2,circleK2,circleM2);
	obslistH3.addAll(circleA3,circleB3,circleC3,circleD3,circleE3,circleF3,circleG3,circleH3,circleI3,circleJ3,circleK3,circleM3);
	obslistH4.addAll(circleA4,circleB4,circleC4,circleD4,circleE4,circleF4,circleG4,circleH4,circleI4,circleJ4,circleK4,circleM4);
	obslistH5.addAll(circleA5,circleB5,circleC5,circleD5,circleE5,circleF5,circleG5,circleH5,circleI5,circleJ5,circleK5,circleM5);
	obslistH6.addAll(circleA6,circleB6,circleC6,circleD6,circleE6,circleF6,circleG6,circleH6,circleI6,circleJ6,circleK6,circleM6);
	obslistH7.addAll(circleA7,circleB7,circleC7,circleD7,circleE7,circleF7,circleG7,circleH7,circleI7,circleJ7,circleK7,circleM7);
	obsListH.addAll(obslistH0,obslistH1,obslistH2,obslistH3,obslistH4,obslistH5,obslistH6,obslistH7);
	obsList.addAll(obslist0,obslist1,obslist2,obslist3,obslist4,obslist5,obslist6,obslist7,obslist8,obslist9,obslist10,obslist11);
	
	this.player.setText(game.currentPlayer);
	
	game.propertyProperty().addListener(new ChangeListener<Object>() {

		@Override
		public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
			Alert al1 = new Alert(AlertType.INFORMATION);
			if(game.getProperty()==1) {
				
				al1.setTitle("");
				al1.setContentText("Player1 wins");
				Optional<ButtonType> result = al1.showAndWait();
				if(result.get()==ButtonType.OK) {
					backAction();
				}
			}
			else if(game.getProperty()==2) {
				al1.setTitle("");
				al1.setContentText("Player2 wins");
				Optional<ButtonType> result = al1.showAndWait();
				if(result.get()==ButtonType.OK) {
					backAction();
				}
			}
				
		}
		
	});
	}
	
	public Label getPlayer() {
		return player;
	}
	
	public Button getButtonBack() {
		return this.back;
	}

	public void setPlayer(Label player) {
		this.player = player;
	}

	@FXML
	public void actionHitCol0(ActionEvent e) {
		game.chooseColIndex(0);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol1(ActionEvent e) {
		game.chooseColIndex(1);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol2(ActionEvent e) {
		game.chooseColIndex(2);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol3(ActionEvent e) {
		game.chooseColIndex(3);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol4(ActionEvent e) {
		game.chooseColIndex(4);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol5(ActionEvent e) {
		game.chooseColIndex(5);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol6(ActionEvent e) {
		game.chooseColIndex(6);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol7(ActionEvent e) {
		game.chooseColIndex(7);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol8(ActionEvent e) {
		game.chooseColIndex(8);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol9(ActionEvent e) {
		game.chooseColIndex(9);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol10(ActionEvent e) {
		game.chooseColIndex(10);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
	}
	
	@FXML
	public void actionHitCol11(ActionEvent e) {
		game.chooseColIndex(11);
		game.currentPlayer_();
		game.changePlayer();
		this.player.setText(game.currentPlayer_().toString());
		game.gameplay();
		
		
	}
	
	
	public void backAction() {
		try {
			Stage stage;
			stage = (Stage) back.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("menuPage.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Four Circle Game");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			obslist0.clear();
			obslist1.clear();
			obslist2.clear();
			obslist3.clear();
			obslist4.clear();
			obslist5.clear();
			obslist6.clear();
			obslist7.clear();
			obslist8.clear();
			obslist9.clear();
			obslist10.clear();
			obslist11.clear();
			obsList.clear();
			
			obslistH0.clear();
			obslistH1.clear();
			obslistH2.clear();
			obslistH3.clear();
			obslistH4.clear();
			obslistH5.clear();
			obslistH6.clear();
			obslistH7.clear();
			obsListH.clear();
		} catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	

	

	
	
		
		
	

}
