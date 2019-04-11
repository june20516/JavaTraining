package failed.numeralsystemconverter;

public class NumSysConverter {
	StringBuffer binaryNum;
	
	public StringBuffer toDecimal(StringBuffer binaryNum) {
		int calcInt = 0;
		for(int RIndex = 0; RIndex < binaryNum.length(); RIndex++) {
			int binaryDigit = binaryNum.charAt(binaryNum.length()-1-RIndex);
			if (binaryDigit == '1') {
				calcInt += (int)Math.pow(2, RIndex);
			}
		}
		return new StringBuffer().append(calcInt);
	}
	
	public StringBuffer toBinary(StringBuffer num) {
		StringBuffer resultNum = new StringBuffer("");
		int intNum = Integer.parseInt(new String(num));
		while(intNum > 0) {
			resultNum.insert(0,intNum%2);
			intNum /= 2;
		}
		return resultNum;
	}
	
	public StringBuffer toOctal(StringBuffer Num) {
		StringBuffer binaryNum = this.toBinary(Num);
		String partialBinary;
		StringBuffer resultStr = new StringBuffer("");
		partialBinary = binaryNum.substring(binaryNum.length()-3);
		binaryNum = binaryNum.delete(binaryNum.length()-3, binaryNum.length());
		resultStr.insert(0, this.toDecimal(new StringBuffer(partialBinary)));
		System.out.print(resultStr);
		return resultStr;
	}
}
