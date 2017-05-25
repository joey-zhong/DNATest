package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
	
public class Driver extends Application {
	
	private Pane root;
	private ObjectHandler handler;
	private Character player;
	
	private Parent createContent() {
		root = new Pane();
		root.setPrefSize(1100, 600);
		//player = ;
		
		AnimationTimer timer = new AnimationTimer(){
			@Override
			public void handle(long now) {
			// TODO Auto-generated method stub
				onUpdate();
			}
		};
		
		timer.start();
		return root;
	}

	
	protected void onUpdate() {
		
	}


	@Override
	public void start(Stage stage) {
		
		
		stage.setScene(new Scene(createContent()));
		stage.getScene().setOnKeyPressed(e -> {
			
			if(e.getCode() == KeyCode.LEFT){
				
			}
			if (e.getCode() == KeyCode.UP) {

			}
			if (e.getCode() == KeyCode.RIGHT) {

			}
			
		});
		stage.show();
	}
	

	public void stop(){
		
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
