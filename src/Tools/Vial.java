package Tools;

public class Vial {
	
	private boolean equipped;
	private boolean isFull;
	
	public boolean getFull(){
		return this.isFull;
	}
	public void setFull(boolean x){
		isFull = x;
	}
	public boolean getEquipped(){
		return this.equipped;
	}
	public void setEquipped(boolean x){
		equipped = x;
	}

	public boolean sampleCollected(){
		// New samples cant be collected if the vile is full or if the vial is not equipped
		return true;
	}
}
