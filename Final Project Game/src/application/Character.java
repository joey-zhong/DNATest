package main;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public  class Character extends GameObject/* extends ImageView*/{
	
	Character() {
		super(new ImageView());
		
	}
	
	private int score;
	private BlockDir blockDirection;
	private Image sprite = new Image("Shuriken.jpg");
	private boolean alive;
	
	
	
	public void update(){
		
	}
	
	public Image getSprite() {
		return sprite;
	}
	public void setSprite() {
		switch (blockDirection){
		case leftDown:
			break;
		case left:
			break;
		case leftUp:
			break;
		case rest:
			break;
		case rightDown:
			break;
		case right:
			break;
		case rightUP:
			break;
		case up:
			break;
		}
	}


	public BlockDir getBlockDirection() {
		return blockDirection;
	}

	public void setBlockDirection(BlockDir blockDirection) {
		this.blockDirection = blockDirection;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
