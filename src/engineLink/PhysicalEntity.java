package engineLink;

public abstract class PhysicalEntity extends Entity{

	
	private float mass;
	
	
	/**
	 * Physical entities exist in the game world and physically interact with other
	 * entities. Collisions are modeled based on a shape and mass. A mass given as zero
	 * will make the the object immovable. This is useful for objects such as walls, buildings
	 * and the ground
	 * 
	 * @param position position in game world
	 * @param rotX rotation about x axix
	 * @param rotY rotation about y axix
	 * @param rotZ rotation about z axixs
	 * @param scale scale up model coordinates to there desired size in world
	 * @param mass inertia to be used in physics engine for movement and collisions
	 */
	public PhysicalEntity(Vector position, float rotX, float rotY, float rotZ, float scale, float mass) {
		super(position, rotX, rotY, rotZ, scale);
		this.setMass(mass);
		
	}
	
	/**
	 * 
	 * @return mass as a float
	 */
	public float getMass() {
		return mass;
	}
	
	/**
	 * 
	 * @param mass as a float
	 */
	public void setMass(float mass) {
		this.mass = mass;
	}

}
