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
	
	private void calcFrom(int sysNum, StringBuffer inputNum) {
		int middleNum = 0;
		if (sysNum != 10) {
			middleNum = Integer.parseInt(toDecimal(inputNum,2).toString());
		} else {
			middleNum = Integer.parseInt(inputNum.toString());
		}
		for(int system : systems) {
			System.out.printf("%d진법으로 %s \n",system, fromDecimal(middleNum,system));
		}
		System.out.println("입니다.");
	}
	
	
	public void convertNumberSys() {
		System.out.println("입력할 값은 몇진법입니까? \n 1. 2진수    2. 8진수    3. 10진수   4. 16진수");
		int inputSys = systems[keyIn.nextInt()-1];
		System.out.println("변환하려는 값을 입력하세요.");
		StringBuffer inputNum = new StringBuffer(keyIn.next());
		System.out.printf("변환하려는 값 %s(%d)는, \n",inputNum.toString(),inputSys);
		calcFrom(inputSys,inputNum);
	}
	
}
