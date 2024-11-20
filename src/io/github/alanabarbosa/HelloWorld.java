package io.github.alanabarbosa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) {    	
    	
    	Button button = new Button("Clique aqui");
    	button.setOnAction(e ->  System.out.println("Hello World!"));
    	
    	VBox box = new VBox();
    	box.setAlignment(Pos.CENTER);
    	box.setSpacing(10);
    	box.getChildren().add(button);
    	
    	Scene scene = new Scene(box, 100, 150);
    	
    	stage.setScene(scene);   	
    	stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}