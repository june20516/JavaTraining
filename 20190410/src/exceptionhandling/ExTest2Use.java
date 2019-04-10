package exceptionhandling;

public class ExTest2Use {
	public static void main(String[] args) {
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		
		boolean returnValue = exceptionTest2.m1(3, 0);
		System.out.println((returnValue) ? "정상완료":"예외발생");
		
		 System.out.println("종료");
	}
}
