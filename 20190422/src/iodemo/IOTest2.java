package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream outPutStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
			outPutStream.writeInt(123);
			outPutStream.writeObject(new Date());
			outPutStream.writeObject(new AA());
			
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

class AA {
	
}