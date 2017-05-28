package application;

import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class GameObject {
	
	private ImageView view;
	private boolean alive = true;
	private int x, y, velX, velY;
	private Point2D velocity = new Point2D(0,0);
	
	public GameObject(ImageView view){
		this.view = view;
	}
	
	public Node getView(){
		return view;
	}
	
	public void update(){
		view.setTranslateX(view.getTranslateX() + velocity.getX());
		view.setTranslateY(view.getTranslateY() + velocity.getY());
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public void setAlive(boolean value){
		alive = value;
	}
	
	public boolean isColliding(GameObject other){
		return getView().getBoundsInParent().intersects(other.getView().getBoundsInParent());
	}
	
}
