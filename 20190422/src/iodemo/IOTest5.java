package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class IOTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 a6 = new A6();
		a6.name = "rague";
		a6.age = 50;

		try {
			FileOutputStream stream = new FileOutputStream("out4.txt");
			ObjectOutputStream outPutStream = new ObjectOutputStream(stream);
			outPutStream.writeObject(a6);	
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
		

			try {
				ObjectInputStream readStream = new ObjectInputStream(new FileInputStream("out4.txt"));
				Object readA6 = readStream.readObject();
				System.out.println(((A6)readA6).age + ((A6)readA6).name);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}

class A6 implements Serializable{
	A3 a3 = new A3();
//	A5 a5 = new A5();	// A5는 Serialize하지 않으므로 NotSerializableException 발생
	

	transient String name;	//라이팅 할 때 제외
	int age;

}
