package numeralsystemconverter;

public class NumSysConverter {
	StringBuffer binaryNum;
	
	public StringBuffer toDecimal(StringBuffer binaryNum) {
		int resultNum = 0;
		for(int RIndex = 0; RIndex < binaryNum.length(); RIndex++) {
			int binaryDigit = binaryNum.charAt(binaryNum.length()-1-RIndex);
			if (binaryDigit == '1') {
				resultNum += (int)Math.pow(2, RIndex);
			}
		}
		return new StringBuffer(resultNum);
	}
	
	public StringBuffer toBinary(StringBuffer Num) {
		StringBuffer binaryNum = new StringBuffer("");
		int a = 2444;
		
//		for(int i = 0;)
		return null;
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
