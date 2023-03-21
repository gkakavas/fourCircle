package application;

import java.util.Random;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Game {
	private DoubleProperty property; 
	
	private boolean player1;
	private boolean player2;
	
	protected String firstPlayer;
	protected String currentPlayer; 
	
	private int col0Index = -1; 
	private int col1Index = -1; 
	private int col2Index = -1; 
	private int col3Index = -1; 
	private int col4Index = -1;
	private int col5Index = -1; 
	private int col6Index = -1; 
	private int col7Index = -1; 
	private int col8Index = -1; 
	private int col9Index = -1;
	private int col10Index = -1; 
	private int col11Index = -1;
	
	public Game() {
		 randomFirstPlayer();
		 
	}
	 
	public double getProperty() {
		if(property!=null)
			return property.get();
		return 0;
	}
	
	public final DoubleProperty propertyProperty()
	{
		if (property==null)
		{
			property = new SimpleDoubleProperty(0);
		}
		return property; 
	}

	public void setProperty(double property) {
		this.property.set(property);;
	}



	public int getCol0Index() {
		return col0Index;
	}

	public void setCol0Index(int col0Index) {
		this.col0Index = col0Index;
	}

	public int getCol1Index() {
		return col1Index;
	}

	public void setCol1Index(int col1Index) {
		this.col1Index = col1Index;
	}

	public int getCol2Index() {
		return col2Index;
	}

	public void setCol2Index(int col2Index) {
		this.col2Index = col2Index;
	}

	public int getCol3Index() {
		return col3Index;
	}

	public void setCol3Index(int col3Index) {
		this.col3Index = col3Index;
	}

	public int getCol4Index() {
		return col4Index;
	}

	public void setCol4Index(int col4Index) {
		this.col4Index = col4Index;
	}

	public int getCol5Index() {
		return col5Index;
	}

	public void setCol5Index(int col5Index) {
		this.col5Index = col5Index;
	}

	public int getCol6Index() {
		return col6Index;
	}

	public void setCol6Index(int col6Index) {
		this.col6Index = col6Index;
	}

	public int getCol7Index() {
		return col7Index;
	}

	public void setCol7Index(int col7Index) {
		this.col7Index = col7Index;
	}

	public int getCol8Index() {
		return col8Index;
	}

	public void setCol8Index(int col8Index) {
		this.col8Index = col8Index;
	}

	public int getCol9Index() {
		return col9Index;
	}

	public void setCol9Index(int col9Index) {
		this.col9Index = col9Index;
	}

	public int getCol10Index() {
		return col10Index;
	}

	public void setCol10Index(int col10Index) {
		this.col10Index = col10Index;
	}

	public int getCol11Index() {
		return col11Index;
	}

	public void setCol11Index(int col11Index) {
		this.col11Index = col11Index;
	}

	public boolean isPlayer1() {
		return player1;
	}

	public boolean isPlayer2() {
		return player2;
	}
	
	public void setPlayer1(boolean player1) {
		this.player1 = player1;
	}
	
	public void setPlayer2(boolean player2) {
		this.player2 = player2;
	}
	
	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	public void randomFirstPlayer() {
		Random random = new Random();
		while(!isPlayer1()&&!isPlayer2()) {
			this.player1 = random.nextBoolean();
			this.player2 = random.nextBoolean();
	
			if(isPlayer1()) {
				this.player2=false;
			}
			else if(isPlayer2()) {
				this.player1=false;
			}
		}
	}
	
	protected String currentPlayer_() {
		if (isPlayer1() == true) {
			this.currentPlayer = "player1";
		}
		else if (isPlayer2() == true) {
			this.currentPlayer = "player2";
		}
		return currentPlayer;
	}

	public void chooseColIndex(int chooseCol) {
		try {
		switch(chooseCol) {
		case 0:
			if(currentPlayer_().equals("player1")) {
				setCol0Index(getCol0Index()+1);
				GameController.obslist0.get(getCol0Index()).setFill(Color.GREEN);
				}
			else if (currentPlayer_().equals("player2")){
				setCol0Index(getCol0Index()+1);
				GameController.obslist0.get(getCol0Index()).setFill(Color.TOMATO);
				}
			break;
		case 1:
			if(currentPlayer_().equals("player1")) {
				setCol1Index(getCol1Index()+1);
				GameController.obslist1.get(getCol1Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol1Index(getCol1Index()+1);
					GameController.obslist1.get(getCol1Index()).setFill(Color.TOMATO);
				}
			break;
		case 2:
			if(currentPlayer_().equals("player1")) {
				setCol2Index(getCol2Index()+1);
				GameController.obslist2.get(getCol2Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol2Index(getCol2Index()+1);
					GameController.obslist2.get(getCol2Index()).setFill(Color.TOMATO);
				}
			break;
		case 3:
			if(currentPlayer_().equals("player1")) {
				setCol3Index(getCol3Index()+1);
				GameController.obslist3.get(getCol3Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol3Index(getCol3Index()+1);
					GameController.obslist3.get(getCol3Index()).setFill(Color.TOMATO);
				}
			break;
		case 4:
			if(currentPlayer_().equals("player1")) {
				setCol4Index(getCol4Index()+1);
				GameController.obslist4.get(getCol4Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol4Index(getCol4Index()+1);
					GameController.obslist4.get(getCol4Index()).setFill(Color.TOMATO);
				}
			break;
		case 5:
			if(currentPlayer_().equals("player1")) {
				setCol5Index(getCol5Index()+1);
				GameController.obslist5.get(getCol5Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer.equals("player2")) {
					setCol5Index(getCol5Index()+1);
					GameController.obslist5.get(getCol5Index()).setFill(Color.TOMATO);
				}
			break;
		case 6:
			if(currentPlayer_().equals("player1")) {
				setCol6Index(getCol6Index()+1);
				GameController.obslist6.get(getCol6Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer.equals("player2")){
					setCol6Index(getCol6Index()+1);
					GameController.obslist6.get(getCol6Index()).setFill(Color.TOMATO);
				}
			break;
		case 7:
			if(currentPlayer_().equals("player1")) {
				setCol7Index(getCol7Index()+1);
				GameController.obslist7.get(getCol7Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol7Index(getCol7Index()+1);
					GameController.obslist7.get(getCol7Index()).setFill(Color.TOMATO);
				}
			break;
		case 8:
			if(currentPlayer_().equals("player1")) {
				setCol8Index(getCol8Index()+1);
				GameController.obslist8.get(getCol8Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol8Index(getCol8Index()+1);
					GameController.obslist8.get(getCol8Index()).setFill(Color.TOMATO);
				}
			break;
		case 9:
			if(currentPlayer_().equals("player1")) {
				setCol9Index(getCol9Index()+1);
				GameController.obslist9.get(getCol9Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol9Index(getCol9Index()+1);
					GameController.obslist9.get(getCol9Index()).setFill(Color.TOMATO);
				}
			break;
		case 10:
			if(currentPlayer_().equals("player1")) {
				setCol10Index(getCol10Index()+1);
				GameController.obslist10.get(getCol10Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol10Index(getCol10Index()+1);
					GameController.obslist10.get(getCol10Index()).setFill(Color.TOMATO);
				}
			break;
		case 11:
			if(currentPlayer_().equals("player1") ) {
				setCol11Index(getCol11Index()+1);
				GameController.obslist11.get(getCol11Index()).setFill(Color.GREEN);
				}
				else if (currentPlayer_().equals("player2")){
					setCol11Index(getCol11Index()+1);
					GameController.obslist11.get(getCol11Index()).setFill(Color.TOMATO);
					
				}
			break;
		}
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public void changePlayer() {
		if(currentPlayer.equals("player1")) {
			this.currentPlayer = "player2";
			this.player1=false;
			this.player2=true;
		}
		else if (currentPlayer.equals("player2")) {
			this.currentPlayer = "player1";
			this.player1 = true;
			this.player2 = false;
		}
	}
		
	public void gameplay(){
		try {
			for(ObservableList<Circle> obsL:GameController.obsList) {
				for(int i=0;i<=4;i++) {
					
					Circle c0,c1,c2,c3;
					c0=obsL.get(i);
					c1=obsL.get(i+1);
					c2=obsL.get(i+2);
					c3=obsL.get(i+3);
					if(c0.getFill()==Color.TOMATO&&c1.getFill()==Color.TOMATO&&
						c2.getFill()==Color.TOMATO&&c3.getFill()==Color.TOMATO) {
							setProperty(1);
					}
					else if(c0.getFill()==Color.GREEN&&c1.getFill()==Color.GREEN&&
							c2.getFill()==Color.GREEN&&c3.getFill()==Color.GREEN) {
							setProperty(2);
					}
				}
			}
			for(ObservableList<Circle> obsL:GameController.obsListH) {
				for(int i=0;i<=8;i++) {
					Circle c0,c1,c2,c3;
					c0=obsL.get(i);
					c1=obsL.get(i+1);
					c2=obsL.get(i+2);
					c3=obsL.get(i+3);
					if(c0.getFill()==Color.TOMATO&&c1.getFill()==Color.TOMATO&&
							c2.getFill()==Color.TOMATO&&c3.getFill()==Color.TOMATO) {
								setProperty(1);
						}
					else if(c0.getFill()==Color.GREEN&&c1.getFill()==Color.GREEN&&
								c2.getFill()==Color.GREEN&&c3.getFill()==Color.GREEN) {
								setProperty(2);
						}
				}
			}
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		
		}
	}

}
	
		
			
		
	
	

