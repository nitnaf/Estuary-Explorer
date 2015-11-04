package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Sample;
/*
 * You must run the serialize test first. 
 */

public class SampleDeserialiazeTests {
	public static void main(String [] args)
	   {
	      Sample s = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/sample.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         s = (Sample) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Sample class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Sample Data...");
	      System.out.println("Location X: " + s.getXPosition());
	      System.out.println("Location Y: " + s.getYPosition());
	      System.out.println("Sample turbidity: " + s.getTurbidity());
	      System.out.println("Sample pH: " + s.getpH());

	    }
}
