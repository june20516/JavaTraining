package exceptionhandling;

import java.io.IOException;

public class IOExceptionTest2 {
	//키보드로부터 입력받는다
	// os command상에서 작업할 때 : console in, console out
	// java에서 작업할 떄 : System.in, System.out
	public static void main(String[] args) {
		try {
			System.in.read();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}
}
