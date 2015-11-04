package Controller;

import java.util.ArrayList;

import Models.GameObject;
import engineLink.Entity;


/**
 * Controller in model. Directs objects to update model and draw while keeping time as game progresses
 * @author 
 *
 */
public class Controller {
	
	ArrayList<GameObject> entities = new ArrayList<GameObject>();
	
	public Controller(){
		
	}
	
	
	/**
	 * Creates window and sets up 
	 */
	public void createDisplay(){
		
	}
	
	/**
	 * Cleans up display and closes window
	 */
	public void cleanupDisplay(){
		
	}
	
	
	public void  run(){
		createDisplay();
		boolean playingGame = true;
		float previous_time = System.currentTimeMillis();
		float elapsedTime = 0f;
		while(playingGame){
			
			float currentTime = System.currentTimeMillis();
			float dt = currentTime - previous_time;
			elapsedTime += dt;
			
			//a healthy 60 fps
			if(elapsedTime > 1000f/60f){
				elapsedTime -= 1000f/60f;
				tick();
				render();
			}
			
			
			//Check game condition... window open?
		}
		
		cleanupDisplay();
	}
	
	/**
	 * Updates the model by iterating through each object and calling update position
	 */
	public void tick(){
		
		for(GameObject gameObject: entities){
			gameObject.updatePosition();
		}
		
		
	}
	
	
	/**
	 * Visually draws the display 
	 */
	public void render(){
		
		
		
		for(GameObject gameObject: entities){
			gameObject.draw();
		}
		
	}

}
