package iodemo;

import java.io.IOException;
import java.io.InputStream;

public class InputTest2 {
	public static void main(String[] args) throws IOException {
		InputStream keyIn = System.in;
		System.out.println("첫번째 : ");
		int val1 = keyIn.read()-'0';

		int val2 = keyIn.read()-'0';
		System.out.print(val1+val2);
		System.out.println("val1 = " + val1 + " , val2 = " + val2 + ", val1+val2 = " + (val1 + val2));
		
	}
}