package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class IOTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a4 = new A4();
		a4.name = "rague";
		a4.age = 50;
		
		
		try {
			FileOutputStream stream = new FileOutputStream("out3.txt");
			ObjectOutputStream outPutStream = new ObjectOutputStream(stream);
			outPutStream.writeObject(a4);
			
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

class A4 implements Serializable{
	A3 a3 = new A3();
//	A5 a5 = new A5();	// A5는 Serialize하지 않으므로 NotSerializableException 발생
	

	String name;
	int age;
	
}

class A5 {
	
}