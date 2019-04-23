package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class IOTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a3 = new A3();
		a3.name = "rague";
		a3.age = 50;
		
		try {
			FileOutputStream stream = new FileOutputStream("out2.txt");
			byte[] bs = a3.name.getBytes();
			stream.write(bs);
			stream.write(a3.age-'0');
			stream.flush();
//			ObjectOutputStream outPutStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
//			outPutStream.writeInt(123);
//			outPutStream.writeObject(new Date());
//			outPutStream.writeObject(new A3());
//			
//			outPutStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class A3 implements Serializable{
	String name;
	int age;
	
}