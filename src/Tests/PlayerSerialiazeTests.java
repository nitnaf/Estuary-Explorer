package Tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import Models.Player;

public class PlayerSerialiazeTests {
	public static void main(String [] args)
	   {
	      Player p = new Player();
	 
	      p.setTimeRemaining(60);//60s
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/player.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(p);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized fish data is saved in /tmp/player.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
