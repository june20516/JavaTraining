package exceptionhandling;

import java.text.SimpleDateFormat;

public class ExSpecification {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.parse("");
	}
}
