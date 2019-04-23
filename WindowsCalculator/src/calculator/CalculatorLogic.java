package calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLogic {
	
	// 숫자를 입력받는다
		// headNum에 저장
		// headNum을 출력
	// 이항 연산자를 입력받는다
		// headNum을 tailNum으로 넘김, headNum 비움
		// operator를 저장
	// 숫자를 입력받는다
		//headNum에 저장
	// 이항 연산자를 입력받는다
		// headNum과 tailNum이 있고 operator가 있다면 계산하여 headNum에 저장
		// headNum을 출력
		// headNum을 tailNum으로 넘김, headNum 비움
		// operator를 저장
	// 숫자를 입력받는다
		//headNum에 저장
	// =를 입력받는다
		// headNum과 tailNum이 있고 operator가 있다면 계산하여 headNum에 저장
		// headNum을 출력
		// 정답이 출력됨
	
	
	
	
	
	//숫자를 입력받는다
		// headNum에 저장
		// headNum을 출력
	// 이항 연산자를 입력받는다
		// headNum을 tailNum으로 넘김, headNum 비움
		// operator를 저장
	//숫자를입력받는다
	// headNum에 저장
	// headNum을 출력
	//단항연산자를 입력받는다
		//unaOpt에 저장
		//headNum을 unaOpt로 연산하고 headNum에 저장
	//=를 입력받는다
		// headNum과 tailNum이 있고 operator가 있다면 계산하여 headNum에 저장
		// headNum을 출력
		// 정답이 출력됨
	
	
	//숫자를 입력받는다
			// headNum에 저장
			// headNum을 출력	
	//단항연산자를 입력받는다
		//unaOpt에 저장
	//=를 입력받는다
		// headNum과 tailNum이 있고 operator가 있다면 계산하여 headNum에 저장
		// headNum을 출력
		// 정답이 출력됨
	
	//+−×÷√=
	
	/*
	 * 화면에 출력하게 되는 숫자. 
	 * 입력과 계산을 포함해 프로세스에서 가장 최근의 입력이 담
	 */
	private Double headNum;
	/*
	 * 일반 연산자. 이항연산을 수행하는 연산자. UI input의 호환성을 위해 char대신 String사용
	 */
	private String operator;
	/*
	 * 단항 연산자. 단항연산을 수행하는 연산자. 
	 */
	private String unaOpt;
	/*
	 * 이항연산을 목적으로 기존 입력이 저장되는 숫자. 
	 */
	private Double tailNum;
	
	/*
	 * 이항연산 후 결과 return
	 */
	private Double calculateBinalOperator(Double headNum, double tailNum, String operator) {
		switch (operator) {
		case "+": return headNum + tailNum;
		case "−": return headNum - tailNum;
		case "×": return headNum * tailNum;
		case "÷": return (tailNum != 0) ? headNum / tailNum : tailNum;
		default : return headNum;
		}
	}
	
	/*
	 * 단항연산 후 결과 return
	 */
	private Double calculateUnaryOperator(Double headNum, String unaOpt) {
		switch (unaOpt) {
		case "√": return Math.sqrt(headNum);
		case "±": return headNum * -1.0;
		default : return headNum;
		}
	}
	
	/*
	 * head를 tail로 넘기고 head를 비움
	 */
	public void tossNum(){
		tailNum = headNum;
		headNum = null;
	}
	
	/*
	 * 준비된 값이 있는지 확인하고 단항/이항연산을 판별하여 
	 * 계산 후 결과를 return
	 */
	public Double excecuter() {
		if(headNum != null && tailNum != null) {
			headNum = calculateBinalOperator(headNum, tailNum, operator);
			tailNum = null;
		} else if (headNum != null && unaOpt != null) {
			headNum = calculateUnaryOperator(headNum, unaOpt);
			tailNum = null;
		}
		return headNum;
	}
}
