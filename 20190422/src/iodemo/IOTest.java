package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream outPutStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
			outPutStream.writeInt(123);
			outPutStream.writeObject(new Date());
			outPutStream.writeObject(new A());
			
			outPutStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class A implements Serializable{
	
}