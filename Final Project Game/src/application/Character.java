package application;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public  class Character extends GameObject{
	
	private int score;
	private ImageView iv;
	private BlockDir blockDirection;
	private Image[] state;
	private int curState;
	private boolean alive;
	
	public Character(ImageView view){
		super(view);
		this.score = 0;
		this.state = new Image[4];
		state[0] = new Image("Left.png", 70, 70, true, false);
		state[1] = new Image("Right.png", 70, 70, true, false);
		state[2] = new Image("UpLeft.png", 70, 70, true, false);
		state[3] = new Image("UpRight.png", 70, 70, true, false);
		iv = new ImageView();
		this.curState = 0;
	}
	
	public void setLeft(){
		curState = 0;
	}
	
	public void setRight(){
		curState = 1;
	}
	
	public void setLeftandUp(){
		curState = 2;
	}
	
	public void setRightandUp(){
		curState = 3;
	}
		
	public Image getState(){
		return state[curState];
	}
	
	public int get(){
		return curState;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
