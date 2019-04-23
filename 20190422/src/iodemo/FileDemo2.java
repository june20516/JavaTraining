package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
			File file = new File("test3.txt");
//			FileWriter fw = new FileWriter(file);
			OutputStream os;
			System.out.println(file.getAbsolutePath());
			try {
				os = new FileOutputStream(file);
				os.write(97);
				os.write(98);
				os.write(99);
				os.write(100);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
