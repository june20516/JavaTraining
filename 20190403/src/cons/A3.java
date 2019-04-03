package cons;

public class A3 {
	public A3() {
		System.out.println("||||||||");
	}
	
	public A3(int i) {
		this();
		System.out.println("\\\\\\\\\\\\\\\\");
	}
	
	public A3(double d) {
		this((int)(d));
		System.out.println("////////");
	}
	
	
	
}
