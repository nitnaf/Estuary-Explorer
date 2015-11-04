package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Boat;

/*
 * You must run the serialize test first. 
 */
public class BoatDeserializeTests {
	public static void main(String [] args)
	   {
	      Boat b = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/boat.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         b = (Boat) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Boat class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Boat Data...");
	      System.out.println("Location X: " + b.getXPosition());
	      System.out.println("Location Y: " + b.getYPosition());
	      System.out.println("Boat Health Level: " + b.getHealth());
	    }
}
