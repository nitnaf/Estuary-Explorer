package Models;

import java.io.Serializable;

import View.Drawable;

public abstract class GameObject implements Physical, Drawable, Serializable{
	
	public abstract int getXPosition();
	public abstract int getYPosition();
	public abstract void updatePosition();
	public abstract boolean collision(GameObject x);

}
