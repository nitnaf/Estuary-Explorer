package Models;

import javax.sql.rowset.JdbcRowSet;
import javax.tools.JavaCompiler;

public class Player implements java.io.Serializable{
	
	private double timeRemaining;
	private GameObject selectedObject;
	
	public double getTimeRemaining() {
		return timeRemaining;
	}

	public void setTimeRemaining(double timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

	public GameObject getSelectedObject() {
		return selectedObject;
	}

	public void setSelectedObject(GameObject selectedObject) {
		this.selectedObject = selectedObject;
	}

	public void selectObject(){
		
	}
	
	public void useTool(){
		
	}
	

}
