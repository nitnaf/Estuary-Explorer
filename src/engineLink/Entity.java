package engineLink;

public abstract class Entity {

	
	
	private Vector position;
	private float rotX, rotY, rotZ;
	private float scale;
	
	
	
	/**
	 * All game objects will extend Entity which gives them a location within the game world,
	 * this class also provides the base for having a visual/physical presence.
	 * 
	 * 
	 * @param position position in game world
	 * @param rotX rotation about x axix
	 * @param rotY rotation about y axix
	 * @param rotZ rotation about z axixs
	 * @param scale scale up model coordinates to there desired size in world
	 */
	public Entity(Vector position, float rotX, float rotY, float rotZ, float scale) {
		super();
		this.position = position;
		this.rotX = rotX;
		this.rotY = rotY;
		this.rotZ = rotZ;
		this.scale = scale;
	}
	
}
