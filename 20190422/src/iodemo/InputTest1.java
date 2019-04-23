package iodemo;

import java.io.IOException;
import java.io.InputStream;

public class InputTest1 {
	public static void main(String[] args) throws IOException {
		 InputStream keyIn = System.in;
		 System.out.println("입력해보자");
//		 while(true) {
//			 int readValue = keyIn.read();
//			 System.out.println(readValue);
//		 }
		 byte[] bs = new byte[10];
		 int readCountValue = keyIn.read(bs);
		 System.out.println(readCountValue+" 개 읽었다");
		 for(byte b : bs) {
			 System.out.println(b+" 다");
		 }
		 System.out.println("끝");
	}
}
