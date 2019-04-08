package statictest;

public class Test {
	final static public int MAX;
	static {
		String s = "This is static string";
		MAX = s.length();
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main block");
		int min = Integer.MIN_VALUE;
		
	}

}
