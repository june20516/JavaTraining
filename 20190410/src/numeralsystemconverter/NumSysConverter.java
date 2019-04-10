package numeralsystemconverter;

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
		StringBuffer calcBuffer = new StringBuffer("");
		StringBuffer resultNum = new StringBuffer("");
		int intNum = Integer.parseInt(new String(num));
		while(intNum > 0) {
			calcBuffer.append(intNum%2);
			intNum /= 2;
		}
		for (int idx = calcBuffer.length()-1; idx >= 0; idx--) {
			resultNum.append(calcBuffer.charAt(idx));
		}
		return resultNum;
	}
	
//	public StringBuffer toOctal(StringBuffer Num) {
//		int binaryNum = this.toDecimal(Num);
//		StringBuffer partialBinary;
//		StringBuffer resultStr = new StringBuffer("");
//		partialBinary = binaryNum.delete(binaryNum.length()-4, binaryNum.length()-1);
//		resultStr.insert(resultStr.length(), this.toDecimal(partialBinary));
//		System.out.println(resultStr);
//		return resultStr;
//	}
}
