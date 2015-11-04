package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Models.Tree;;

public class TreeDeserialiazeTests {
	public static void main(String [] args)
	   {
	      Tree t = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/tree.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         t = (Tree) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Tree class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Tree Data...");
	      System.out.println("Location X: " + t.getXPosition());
	      System.out.println("Location Y: " + t.getYPosition());
	      System.out.println("Tree Alive? " + t.isAlive());
	    }
}
