package Models;

import View.Drawable;

public abstract class GameObject implements Physical, Drawable{
	
	public abstract int getXPosition();
	public abstract int getYPosition();
	public abstract void updatePosition();
	public abstract boolean collision(GameObject x);

}
