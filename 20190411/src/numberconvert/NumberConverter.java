package numberconvert;

import java.util.Scanner;

public class NumberConverter {
	Scanner keyIn = new Scanner(System.in);
	int[] systems = {2,8,10,16};

	private StringBuffer fromDecimal(int decimalNum, int inputSys) {
		StringBuffer resultBuffer = new StringBuffer("");
		while (decimalNum > 0) {
			int temp = decimalNum % inputSys;
			if (temp >= 10 && temp <= 15) {
				resultBuffer.insert(0, (char) ('a' + (temp - 10)));
			} else {
				resultBuffer.insert(0, (char) ('0' + temp));
			}
			decimalNum /= inputSys;
		}
		return resultBuffer;
	}

	private StringBuffer toDecimal(StringBuffer sysNum, int inputSys) {
		int calcInt = 0;
		for (int idx = 0; idx < sysNum.length(); idx++) {
			char sysDigit = Character.toLowerCase(sysNum.charAt(sysNum.length() - 1 - idx));
			if (inputSys>10 && sysDigit >= 'a' ) {
				calcInt += (int) Math.pow(inputSys, idx) *(sysDigit -'a' + 10);
			} else {
				calcInt += (int) Math.pow(inputSys, idx) *(sysDigit-'0');
			}
		}
		return new StringBuffer().append(calcInt);
	}
	
	private int inputSys() {
		return keyIn.nextInt();
	}
	
	private void calcFromDecimal(StringBuffer inputNum) {
		int middleNum = Integer.parseInt(inputNum.toString());
		//fromdecimal(2)
		System.out.printf("2진법으로 %s \n", fromDecimal(middleNum,2));
		//fromdecimal(8)
		System.out.printf("8진법으로 %s \n", fromDecimal(middleNum,8));
		//frimdecimal(16)
		System.out.printf("16진법으로 %s  입니다. \n", fromDecimal(middleNum,16));
	}
	
	private void calcFromBinal(StringBuffer inputNum) {
		int middleNum = Integer.parseInt(toDecimal(inputNum,2).toString());
		//fromdecimal(8)
		System.out.printf("8진법으로 %s \n", fromDecimal(middleNum,8));
		//fromdecimal(10)
		System.out.printf("10진법으로 %s \n", fromDecimal(middleNum,10));
		//frimdecimal(16)
		System.out.printf("16진법으로 %s  입니다. \n", fromDecimal(middleNum,16));
	}
	
	private void calcFromOctal(StringBuffer inputNum) {
		int middleNum = Integer.parseInt(toDecimal(inputNum, 8).toString());
		//fromdecimal(2)
		System.out.printf("2진법으로 %s \n", fromDecimal(middleNum,2));
		//fromdecimal(10)
		System.out.printf("10진법으로 %s \n", fromDecimal(middleNum,10));
		//frimdecimal(16)
		System.out.printf("16진법으로 %s  입니다. \n", fromDecimal(middleNum,16));
	}
	
	private void calcFromHexdecimal(StringBuffer inputNum) {
		int middleNum = Integer.parseInt(toDecimal(inputNum, 16).toString());
		//fromdecimal(2)
		System.out.printf("2진법으로 %s \n", fromDecimal(middleNum,2));
		//fromdecimal(8)
		System.out.printf("8진법으로 %s \n", fromDecimal(middleNum,8));
		//frimdecimal(10)
		System.out.printf("10진법으로 %s  입니다. \n", fromDecimal(middleNum,10));
	}
	
	public void convertNumberSys() {
		System.out.println("입력할 값은 몇진법입니까? \n 1. 2진수    2. 8진수    3. 10진수   4. 16진수");
		int inputSys = systems[keyIn.nextInt()-1];
		System.out.println("변환하려는 값을 입력하세요.");
		StringBuffer inputNum = new StringBuffer(keyIn.next());
		System.out.printf("변환하려는 값 %s(%d)는, \n",inputNum.toString(),inputSys);
		switch(inputSys) {
		case 2 : calcFromBinal(inputNum);break;
		case 8 : calcFromOctal(inputNum);break;
		case 10 : calcFromDecimal(inputNum);break;
		case 16 : calcFromHexdecimal(inputNum);break;
		default : System.out.println("잘못된 입력입니다");
		}
	}
	
}
