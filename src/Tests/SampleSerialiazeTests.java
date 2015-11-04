package Tests;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Models.Sample;

public class SampleSerialiazeTests {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.setxPos(200);
		s.setyPos(200);
		s.setTurbidity(20);
		s.setpH(7);
		s.setDiscovered(true);

		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/sample.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(s);
			out.close();
			fileOut.close();
			System.out.printf("Serialized sample data is saved in /tmp/sample.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
