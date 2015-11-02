package Models;

import View.Drawable;

public abstract class GameObject implements Physical, Drawable{
		
	public abstract void updatePosition();
	public abstract boolean collision();

}
