package main;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Projectile extends GameObject{
	public Projectile() {
		super(new ImageView());
		// TODO Auto-generated constructor stub
	}
	private int x, y, velX, velY;
	private Image sprite = new Image("Shuriken.jpg");
	
}
