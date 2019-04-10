package numeralsystemconverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public abstract class NumeralSystem {
	ArrayList<char[]> digits;
	HashSet<Character> sysComponents;

	public NumeralSystem() {
	}

	public NumeralSystem(String inputedNum) {
		char[] charArray = inputedNum.toCharArray();
		Collections.addAll(this.digits, charArray);
	}
	

//	public NumeralSystem(int inputedNum) {
//		String numStr = Integer.toString(inputedNum);
//		this.digits = numStr.toCharArray();
//	}
	
	public ArrayList stringtoArray(String inputedStr) {
		inputedStr.toCharArray();
		
		return null;
	}

	abstract NumeralSystem toBinaryNum(NumeralSystem num);

	abstract NumeralSystem toDecimals(NumeralSystem num);

	abstract NumeralSystem toOctalNum(NumeralSystem num);

	abstract NumeralSystem toHexaDecimalNum(NumeralSystem num);

	String toString(char[] numCharArr) {
		return new String(numCharArr);

	}
	
	
//	private boolean checkDigits() throws NumberFormatException {
//		for(char digit : digits) {
//			if sysComponents.
//		}
//		return true;
//	}
//	char[] digits;
//	char[] sysComponents;
//
//	public NumeralSystem() {
//	}
//
//	public NumeralSystem(String inputedNum) {
//		char[] charArray = inputedNum.toCharArray();
//		
//
//	}
//
//	public NumeralSystem(int inputedNum) {
//		String numStr = Integer.toString(inputedNum);
//		this.digits = numStr.toCharArray();
//	}
//
//	abstract NumeralSystem toBinaryNum(NumeralSystem num);
//
//	abstract NumeralSystem toDecimals(NumeralSystem num);
//
//	abstract NumeralSystem toOctalNum(NumeralSystem num);
//
//	abstract NumeralSystem toHexaDecimalNum(NumeralSystem num);
//
//	String toString(char[] numCharArr) {
//		return new String(numCharArr);
//
//	}
//	
//	
//	private boolean checkDigits() throws NumberFormatException {
//		for(char digit : digits) {
//			if sysComponents.
//		}
//		return true;
//	}


}
