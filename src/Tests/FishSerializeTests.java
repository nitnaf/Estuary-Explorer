package Tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Models.Fish;

public class FishSerializeTests {
	public static void main(String [] args)
	   {
	      Fish f = new Fish();
	      f.setxPos(50);
	      f.setyPos(50);
	      f.setInvasive(true);
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/fish.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(f);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized fish data is saved in /tmp/fish.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
