package Tests;

import java.io.*;

import Models.Boat;

public class BoatSerializeTests {
	public static void main(String [] args)
	   {
	      Boat b = new Boat();
	      b.setXPosition(10);
	      b.setYPosition(30);
	      b.setHealth(98);//98 is the percentage (full=100%)
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/res/boat.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(b);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized boat data is saved in /res/boat.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
