package engineLink;

public class VisualEntity extends Entity{

	
	
	/**
	 * Visual Entity corresponds to game entities that are purely for decorative and have no 
	 * physical interaction or game logic. This constructor can therefore be used for any
	 * decoration without having its own type of entity subclass
	 * 
	 * TODO: Make it so it takes a model
	 * 
	 * @see Entity
	 * 
	 * @param position position in game world
	 * @param rotX rotation about x axix
	 * @param rotY rotation about y axix
	 * @param rotZ rotation about z axixs
	 * @param scale scale up model coordinates to there desired size in world
	 */
	public VisualEntity(Vector position, float rotX, float rotY, float rotZ, float scale) {
		super(position, rotX, rotY, rotZ, scale);
		
	}

}
