package exceptionhandling;

public class ThrowTest {
	public static void main(String[] args) {
//		throw new NullPointerException("NPException throw");
//		NullPointerException exception = new NullPointerException();
//		System.out.println();
//		throw exception;
		try {
		RuntimeException exception1 = new SubException();
		throw exception1;
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		Exception exception2 = new SubException();
		try {
			throw exception2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}
}
