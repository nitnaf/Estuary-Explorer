package Tools;

public class Radio implements Policies {
	
	public Radio(){
		
	}
	public void needHelp(){
		// Perhaps give some sort of hint for the player
	}
	public void usePolicy(){
		// Used to select policies
	}
	
	// Policies --------------------------------------------------------------------
	@Override
	public void restrictFertilizer() {
		// Perhaps have these methods check the world grid to see if these policies need to be enacted
	}
	@Override
	public void reclamation() {

	}
	@Override
	public void restrictFishing() {

	}

}
