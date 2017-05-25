package main;

import java.util.LinkedList;

public class ObjectHandler {

	public LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void update(){
		for (int i = 0; i < objects.size(); i++){
			objects.get(i).update();
		}
	}
	
	public void addObject(GameObject object){
		objects.add(object);
	}
	
	public void removeObject(GameObject object){
		objects.remove(object);
	}
	
	
	
}
