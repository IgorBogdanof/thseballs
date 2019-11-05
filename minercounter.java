package thseballs;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class minercounter extends Application implements EventHandler<ActionEvent>{

	Button ett;
	Button tva;
	Button tre;
	Button fyra;
	Button fem;
	Button sex;
	Button sju;
	Button otta;
	Button nio;
	Button plus;
	Button eli;
	
	GridPane gridPane;
	Stage stage;
	HBox Layout;
	
	
	
	public static void main(String[] args) {
		launch();
	}
		
		public void start(Stage primaryStage) throws Exception {
			stage = primaryStage;
				
			knapp();
			
			GridPane container = grid();
			
			Layout = new HBox();
			Layout.getChildren().add(container);
			
			Scene scene = new Scene(Layout,500,600,Color.WHITE);
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
				
		private void knapp() {
			ett = new Button("1");	
			ett.setOnAction(this);
			tva = new Button("2");
			tva.setOnAction(this);
			tre = new Button("3");
			tre.setOnAction(this);
			fyra = new Button("4");
			fyra.setOnAction(this);
			fem = new Button("5");
			fem.setOnAction(this);
			sex = new Button("6");
			sex.setOnAction(this);
			sju = new Button("7");
			sju.setOnAction(this);
			otta = new Button("8");
			otta.setOnAction(this);
			nio = new Button("9");
			nio.setOnAction(this);
			plus = new Button("+");
			plus.setOnAction(this);
			eli = new Button("=");
			plus.setOnAction(this);
		}
		
		
		private GridPane grid() {
			GridPane gridPane = new GridPane();
			
			gridPane.add(ett, 8, 6);
			gridPane.add(tva, 9, 6);
			gridPane.add(tre, 10, 6);
			gridPane.add(fyra, 8, 7);
			gridPane.add(fem, 9, 7);
			gridPane.add(sex, 10, 7);
			gridPane.add(sju, 8, 8);
			gridPane.add(otta, 9, 8);
			gridPane.add(nio, 10, 8);
			gridPane.add(plus, 10, 10);
			gridPane.add(eli, 10, 11);

			
			return gridPane;
		}
		
		
		
		
		

		@Override
		public void handle(ActionEvent event) {
			if(event.getSource() == ett)
			{
				System.out.println("1");
			}
			
			else if(event.getSource() == tva)
			{
				System.out.println("2");
		    }
			
			else if(event.getSource() == tre)
			{
				System.out.println("3");
		    }
			
			else if(event.getSource() == fyra)
			{
				System.out.println("4");
		    }
			
			else if(event.getSource() == fem)
			{
				System.out.println("5");
		    }
			
			else if(event.getSource() == sex)
			{
				System.out.println("6");
		    }
			
			else if(event.getSource() == sju)
			{
				System.out.println("7");
		    }
			
			else if(event.getSource() == otta)
			{
				System.out.println("8");
		    }
			
			else if(event.getSource() == nio)
			{
				System.out.println("9"); 
		    }
			
			
			
		
		
		
} }
	
