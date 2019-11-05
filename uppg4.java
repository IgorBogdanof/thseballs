package thseballs;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class uppg4 {

public static class layout_test extends Application{

@Override
public void start(Stage primaryStage) throws Exception {

HBox bottom = new HBox();
Button exitButton = new Button("Exit");
bottom.getChildren().add(exitButton);
exitButton.setOnAction(event->{
primaryStage.close();

});

Button brendarButton = new Button("New Paige");
bottom.getChildren().add(brendarButton);
brendarButton.setOnAction(event->{
primaryStage.setScene(new Scene(new Group(),500, 500,Color.SKYBLUE));

});


Scene scene = new Scene(bottom,500,500);

primaryStage.setScene(scene);
primaryStage.show();

}
public static void main(String[] args){
launch();

}
}
}
