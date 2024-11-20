package io.github.alanabarbosa.count;

import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Count extends Application {
	
	private int count = 0;
	
	private void updateLabelNumber(Label label) {
		label.setText(Integer.toString(count));
		
		label.getStyleClass().remove("green");
		label.getStyleClass().remove("red");
		
		if (count > 0) {
			label.getStyleClass().add("green");
		} else if (count < 0) {
			label.getStyleClass().add("red");
		}
	}
	
	@Override
	public void start(Stage stage) throws Exception {    	
    	
    	Label labelTitle = new Label("Simple Count");
    	labelTitle.getStyleClass().add("title");
    	Label labelNumber = new Label("0");
    	labelNumber.getStyleClass().add("number");
    	
    	Button btnDecrement= new Button("-");  
    	btnDecrement.getStyleClass().add("buttons");
    	btnDecrement.setOnAction(e ->  {
    		count--;
    		updateLabelNumber(labelNumber);
    	});
    	
    	Button btnIncrement = new Button("+");
    	btnIncrement.getStyleClass().add("buttons");
    	btnIncrement.setOnAction(e ->  {
    		count++;
    		updateLabelNumber(labelNumber);
    	});    	
    	
    	HBox boxBtn = new HBox();
    	boxBtn.setAlignment(Pos.CENTER);
    	boxBtn.setSpacing(10);
    	boxBtn.getChildren().add(btnDecrement);
    	boxBtn.getChildren().add(btnIncrement);
    	
    	VBox box = new VBox();
    	box.getStyleClass().add("content");
    	box.setAlignment(Pos.CENTER);
    	box.setSpacing(10);
    	box.getChildren().add(labelTitle);
    	box.getChildren().add(labelNumber);
    	box.getChildren().add(boxBtn);
    	
    	String styles = getClass()
    			.getResource("/io/github/alanabarbosa/count/Count.css")
    			.toExternalForm();
    	
    	Scene scene = new Scene(box, 400, 400);
    	scene.getStylesheets().add(styles);
    	scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");
    	
    	stage.setScene(scene);   	
    	stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
