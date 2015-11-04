package Tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Models.Tree;


public class TreeSerialiazeTests {
	public static void main(String [] args)
	   {
	      Tree t = new Tree();
	      t.setxPos(33);
	      t.setyPos(66);
	      t.setAlive(true);
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/tree.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(t);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized fish data is saved in /tmp/tree.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
