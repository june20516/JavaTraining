
package numeralsystemconverter;

public class Test {

	public static void main(String[] args) {
		NumSysConverter a = new NumSysConverter();
		
		a.toDecimal(new StringBuffer("111001"));
		a.toOctal(new StringBuffer("9"));
	}

}
