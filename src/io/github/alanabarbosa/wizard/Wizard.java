package io.github.alanabarbosa.wizard;

import javafx.scene.layout.Region;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage window;
	private Scene step1;
	private Scene step2;
	private Scene step3;
	private Scene step4;
	private Scene step5;
	
	@Override
	public void start(Stage stage) throws Exception {    	
		window = stage;
		
		createStep1();
		createStep2();
		createStep3();
		createStep4();
		createStep5();
    	
    	String styles = getClass()
    			.getResource("/io/github/alanabarbosa/wizard/Wizard.css")
    			.toExternalForm();
    	
    	step1.getStylesheets().add(styles);
    	step2.getStylesheets().add(styles);
    	step3.getStylesheets().add(styles);
    	step4.getStylesheets().add(styles);
    	step5.getStylesheets().add(styles);
		
    	window.setScene(step1);
		window.setTitle("Wizard :: Step 1");   	
		window.show();
	}
	
	private void createStep1() {
		Button btnNext = new Button("Next Step 2>>");
		Label labelDescription = new Label("Geralt de Rivia foi um bruxo lendário "
				+ "da Escola do Lobo ativo ao longo do século XIII. Ele amava "
				+ "a feiticeira Yennefer, considerada o amor de sua vida apesar "
				+ "de seu relacionamento tumultuado, e se tornou o pai adotivo de Ciri.");
		
		labelDescription.getStyleClass().add("description-label");
		
	    VBox card = new VBox(labelDescription);
	    card.getStyleClass().add("card"); 
	    card.setAlignment(Pos.CENTER);
	    card.setSpacing(10);
	    VBox.setMargin(card, new Insets(30, 0, 0, 0));
		
		btnNext.setOnAction(e -> {
			window.setScene(step2);
			window.setTitle("Wizard :: Step 2");   	
		});
		
		VBox box = new VBox();
    	box.getStyleClass().add("step1");
    	box.setSpacing(10);
    	Region spacer = new Region();
    	VBox.setVgrow(spacer, Priority.ALWAYS);
    	box.setAlignment(Pos.BOTTOM_RIGHT);
    	box.getChildren().addAll(card, spacer, btnNext);
    	
    	step1 = new Scene(box, 800, 800);
	}
	
	private void createStep2() {
		Button btnPrevious = new Button("<< Previous Step 1");
		Label labelDescription = new Label("Yennefer de Vengerberg, nascida na capital de "
				+ "Aedirn durante o Belleteyn de 1173, é uma poderosa feiticeira e o grande "
				+ "amor do bruxo Geralt de Rívia, além de uma figura materna para Ciri e uma "
				+ "amiga próxima de Triss Merigold.");
		
		labelDescription.getStyleClass().add("description-label");		
		
	    VBox card = new VBox(labelDescription);
	    card.getStyleClass().add("card"); 
	    card.setAlignment(Pos.CENTER);
	    card.setSpacing(10);
	    VBox.setMargin(card, new Insets(30, 0, 0, 0));
		
		btnPrevious.setOnAction(e -> {
			window.setScene(step1);
			window.setTitle("Wizard :: Step 1");   	
		});
		
		Button btnNext = new Button("Next Step 3 >>");
		btnNext.setOnAction(e -> {
			window.setScene(step3);
			window.setTitle("Wizard :: Step 3");   	
		});
		
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		buttonBox.getChildren().addAll(btnPrevious, btnNext);
		    
	    VBox box = new VBox();
	    box.getStyleClass().add("step2");
	    box.setSpacing(10);
	    Region spacer = new Region();
	    VBox.setVgrow(spacer, Priority.ALWAYS);
	    box.getChildren().addAll(card, spacer, buttonBox);
    	
    	step2 = new Scene(box, 800, 800);
	}
	
	private void createStep3() {
		Button btnPrevious = new Button("<< Previous Step 2");
		Label labelDescription = new Label("Cirilla Fiona Elen Riannon, rainha de Cintra, princesa de Brugge "
				+ "e duquesa de Sodden, herdeira de Inis Ard Skellig e Inis An Skellig, soberana de Attre "
				+ "e Abb Yarra. Conhecida como Leoazinha de Cintra ou para os íntimos, Ciri, nasceu em 1253 "
				+ "durante o festival Belleteyn. Ela é filha única de Pavetta, a princesa de Cintra, e Duny, "
				+ "o Ouriço de Erlenwald. E neta da rainha Calanthe. Ciri também é ligada pelo Destino com o "
				+ "bruxo Geralt de Rívia.");
		
		labelDescription.getStyleClass().add("description-label");		
		
	    VBox card = new VBox(labelDescription);
	    card.getStyleClass().add("card"); 
	    card.setAlignment(Pos.CENTER);
	    card.setSpacing(10);
	    VBox.setMargin(card, new Insets(30, 0, 0, 0));
		
		btnPrevious.setOnAction(e -> {
			window.setScene(step2);
			window.setTitle("Wizard :: Step 2");
		});		
		
		Button btnNext = new Button("Next Step 4 >>");
		btnNext.setOnAction(e -> {
			window.setScene(step4);
			window.setTitle("Wizard :: Step 4");   	
		});
		
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		buttonBox.getChildren().addAll(btnPrevious, btnNext);
		    
	    VBox box = new VBox();
	    box.getStyleClass().add("step3");
	    box.setSpacing(10);
	    Region spacer = new Region();
	    VBox.setVgrow(spacer, Priority.ALWAYS);
	    box.getChildren().addAll(card, spacer, buttonBox);
    	
    	step3 = new Scene(box, 800, 800);
	}	
	
	private void createStep4() {
		Button btnPrevious = new Button("<< Previous Step 3");
		Label labelDescription = new Label("Lambert é um dos mais jovens bruxos de Kaer Morhen. Famoso por sua língua afiada, "
				+ "por vezes se mostra rude, e não parece muito afeiçoado a Triss Merigold, à qual ele habitualmente chama "
				+ "somente pelo seu sobrenome, Merigold. Ele também não tem muita afinidade com política, uma característica "
				+ "comum à maioria dos bruxos, tendo ainda ajudado a treinar Ciri na arte do combate.");
		
		labelDescription.getStyleClass().add("description-label");		
		
	    VBox card = new VBox(labelDescription);
	    card.getStyleClass().add("card"); 
	    card.setAlignment(Pos.CENTER);
	    card.setSpacing(10);
	    VBox.setMargin(card, new Insets(30, 0, 0, 0));		
		
		btnPrevious.setOnAction(e -> {
			window.setScene(step3);
			window.setTitle("Wizard :: Step 3");
		});		
		
		Button btnNext = new Button("Next Step 5 >>");
		btnNext.setOnAction(e -> {
			window.setScene(step5);
			window.setTitle("Wizard :: Step 5");   	
		});
		
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		buttonBox.getChildren().addAll(btnPrevious, btnNext);
		    
	    VBox box = new VBox();
	    box.getStyleClass().add("step4");
	    box.setSpacing(10);
	    Region spacer = new Region();
	    VBox.setVgrow(spacer, Priority.ALWAYS);
	    box.getChildren().addAll(card, spacer, buttonBox);
    	
    	step4 = new Scene(box, 800, 800);
	}	
	
	private void createStep5() {
		Button btnPrevious = new Button("<< Previous Step 4");	
		Label labelDescription = new Label("Triss Merigold de Maribor foi uma lendária feiticeira Temeriana do século XIII. "
				+ "Chamada de Décima Quarta da Colina por seus contemporâneos porque foi erroneamente considerada morta durante "
				+ "a Batalha do Monte Sodden, ela passou para a história como Merigold, a Destemida. Ela foi membro do conselho "
				+ "real do Rei Foltest junto com Fercart e Keira Metz, bem como um membro fundador da Loja das Feiticeiras, ela "
				+ "esteve envolvida com política durante a maior parte de sua vida.");
		
		labelDescription.getStyleClass().add("description-label");		
		
	    VBox card = new VBox(labelDescription);
	    card.getStyleClass().add("card"); 
	    card.setAlignment(Pos.CENTER);
	    card.setSpacing(10);
	    VBox.setMargin(card, new Insets(30, 0, 0, 0));	
	    
		btnPrevious.setOnAction(e -> {
			window.setScene(step4);
			window.setTitle("Wizard :: Step 3");
		});		
		
		Button btnClose = new Button("Close");
		btnClose.setOnAction(e -> {
			System.exit(0);
		});
		
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		buttonBox.getChildren().addAll(btnPrevious, btnClose);
		    
	    VBox box = new VBox();
	    box.getStyleClass().add("step5");
	    box.setSpacing(10);
	    Region spacer = new Region();
	    VBox.setVgrow(spacer, Priority.ALWAYS);
	    box.getChildren().addAll(card, spacer, buttonBox);
    	
    	step5 = new Scene(box, 800, 800);
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
