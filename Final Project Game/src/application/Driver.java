package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class Driver extends Application {

	public Pane root;
	public ObjectHandler handler;
	public Character player;
	public Image background = new Image("BackGround.png", 650, 400, true, false);
	public BooleanProperty upPressed = new SimpleBooleanProperty(false);
	public BooleanProperty downPressed = new SimpleBooleanProperty(false);
	public BooleanProperty leftPressed = new SimpleBooleanProperty(false);
	public BooleanProperty rightPressed = new SimpleBooleanProperty(false);

	public Parent createContent() {
		root = new Pane();
		Canvas canvas = new Canvas(650, 400);
		root.getChildren().add(canvas);
		ImageView iv = new ImageView();

		player = new Character(iv);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		long currentNanoTime = System.nanoTime();
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long startNanoTime) {
				reset(gc);
				if(leftPressed.get() && upPressed.get()){
					player.setLeftandUp();
				}
				else if(rightPressed.get() && upPressed.get()){
					player.setRightandUp();
				}
				else if (leftPressed.get()) {
					player.setLeft();
				}
				else if (rightPressed.get()) {
					player.setRight();
				}
				gc.drawImage(player.getState(), 301, 318);
				gc.setFill(Color.RED);
				gc.fillOval(301, 318, 10, 10);
			}
		};

		timer.start();
		return root;
	}

	public void reset(GraphicsContext gc) {
		player.setLeft();
		gc.drawImage(background, 0, 0);
	}


	@Override
	public void start(Stage stage) {

		Scene scene = new Scene(createContent());
		stage.setScene(scene);

		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.UP) {
					upPressed.set(true);
				}
				if (event.getCode() == KeyCode.DOWN) {
					downPressed.set(true);
				}
				if (event.getCode() == KeyCode.LEFT) {
					leftPressed.set(true);
				}
				if (event.getCode() == KeyCode.RIGHT) {
					rightPressed.set(true);
				}
			}

		});

		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.UP) {
					upPressed.set(false);
				}
				if (event.getCode() == KeyCode.DOWN) {
					downPressed.set(false);
				}
				if (event.getCode() == KeyCode.LEFT) {
					leftPressed.set(false);
				}
				if (event.getCode() == KeyCode.RIGHT) {
					rightPressed.set(false);
				}
			}
		});
		stage.show();
	}

	public void stop() {

	}

	public static void main(String[] args) {
		launch(args);
	}

}
