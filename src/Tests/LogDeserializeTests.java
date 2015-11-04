package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Fish;
import Models.Log;
/*
 * You must run the serialize test first. 
 */

public class LogDeserializeTests {
	public static void main(String [] args)
	   {
	      Log l = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/log.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         l = (Log) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Log class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Log Data...");
	      System.out.println("Location X: " + l.getxPos());
	      System.out.println("Location Y: " + l.getxPos());
	  
	    }
}
