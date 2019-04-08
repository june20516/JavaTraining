package privateconst;

/*
 * single tone pattern
 */

public class PrivateConstTest2 {
	
	
	private static PrivateConstTest2 instance;
	private PrivateConstTest2() {
		System.out.println("PCT2 address : " + this);
	}
	
	public static PrivateConstTest2 getInstance() {
		if (instance == null) {
			instance = new PrivateConstTest2();
		}
		return instance;
	}
	public void m1() {
		System.out.println("¿¥¿ø");
	}
}
