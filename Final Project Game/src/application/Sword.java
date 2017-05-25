package main;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sword extends GameObject{
	public Sword() {
		super(new ImageView());
		// TODO Auto-generated constructor stub
	}
	private int x,y;
	private BlockDir blockDirection;
	private Image sprite;
}
