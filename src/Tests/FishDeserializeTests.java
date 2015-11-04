package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Fish;

public class FishDeserializeTests {
	public static void main(String [] args)
	   {
	      Fish f = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/fish.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         f = (Fish) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Fish class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Fish Data...");
	      System.out.println("Location X: " + f.getXPosition());
	      System.out.println("Location Y: " + f.getYPosition());
	      System.out.println("Fish vasive: " + f.isInvasive());
	      System.out.println("Fish physical: " + f.isPhysical());
	    }
}
