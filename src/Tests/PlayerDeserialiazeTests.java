package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Fish;
import Models.Player;

public class PlayerDeserialiazeTests {
	public static void main(String [] args)
	   {
	      Player p = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/player.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         p = (Player) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Player class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Player Data...");
	      System.out.println("Time Remaining: " + p.getTimeRemaining());
	
	    }
}
