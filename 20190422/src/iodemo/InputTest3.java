package iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest3 {
	public static void main(String[] args) throws IOException {
		InputStream keyIn = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(keyIn));
		System.out.println("첫번째 : ");
		String bufferedValue = br.readLine();
		
		System.out.println(bufferedValue);
	}
}