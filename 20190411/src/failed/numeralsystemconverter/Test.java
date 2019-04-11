
package failed.numeralsystemconverter;

public class Test {

	public static void main(String[] args) {
		NumSysConverter a = new NumSysConverter();
		
		System.out.println(a.toDecimal(new StringBuffer("100011000100")));
		System.out.println(a.toBinary(new StringBuffer("2244")));
		System.out.println(a.toOctal(new StringBuffer("2244")));
		
	}

}
