package Tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Models.Log;

public class LogSerializeTests {
	public static void main(String [] args)
	   {
	      Log l = new Log();
	      l.setxPos(25);
	      l.setyPos(25);
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/log.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(l);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized log data is saved in /tmp/log.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
