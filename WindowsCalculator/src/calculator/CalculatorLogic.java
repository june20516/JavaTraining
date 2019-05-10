package calculator;

import java.util.Stack;

/**
 * UI부에서 입력받은 값들을 numStack 스택에 담는다.
 * 오퍼레이터가 있고 stack의 값이 2개인 상황이 되면 계산하여 다시 stack에 담는다.
 * 
 * @author junholee
 *
 */
public class CalculatorLogic {
	/*
	 * 일반 연산자. 이항연산을 수행하는 연산자. UI input의 호환성을 위해 char대신 String사용
	 */
	private String operator;

	/*
	 * UI부에서 결정 되는 숫자를 담는다.
	 * 계산이 필요할 땐 꺼내서 계산하고 다시 담는다.
	 */
	private Stack<Double> numStack;
	
	public CalculatorLogic() {
		init();
	}
	
	/**
	 * prepare using calculator
	 * set variable empty state
	 */
	public void init() {
		this.operator = null;
		this.numStack = new Stack<Double>();
		
	}

	/**
	 * argument size must be less then 2
	 * @param numStack
	 */
	public void setNumStack(Stack<Double> numStack) {
		if (numStack.size() <= 2)
			this.numStack = numStack;
		else
			return;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

//	public String getUnaOpt() {
//		return unaOpt;
//	}

//	public void setUnaOpt(String unaOpt) {
//		this.unaOpt = unaOpt;
//	}
	
	/**
	 * 이항연산
	 * @param numStack
	 * @param operator
	 */
	private void calculateBinalOperator(Stack<Double> numStack, String operator) {
		Double lastNum = this.numStack.pop();
		Double FirstNum = this.numStack.pop();
		switch (operator) {
		case "+":
			this.numStack.push(FirstNum + lastNum);
			break;
		case "−":
			this.numStack.push(FirstNum - lastNum);
			break;
		case "×":
			this.numStack.push(FirstNum * lastNum);
			break;
		case "÷":
			this.numStack.push((lastNum != 0) ? FirstNum / lastNum : lastNum);
			break;
		default:
			return;
		}
	}
	
	/*
	 * 이항연산자 눌렀을 때 작동할 함수.
	 * 연산자가 비어있는 경우 숫자랑 연산자만 세팅. 
	 * 연산자가 있었던 경우 숫자 세팅 후 기존연산자 계산하고 다시 연산자 세팅.
	 */
	public Double excecuteBinalCalc(Double passedNum, String operator) {
		if (this.operator == null) {
			this.numStack.push(passedNum);
			setOperator(operator);
			return this.numStack.peek();
		} else {
			this.numStack.push(passedNum);
			calculateBinalOperator(this.numStack, this.operator);
			setOperator(operator);
			return this.numStack.peek();
		}
	}
	
	/*
	 * 단항연산자를 눌렀을때 작동할 함수 : 단항연산 후 결과 return
	 */
	public Double excecuteUnaryCalc(Double passedNum, String unaOpt) {
		switch (unaOpt) {
		case "√":
			return (Math.sqrt(passedNum));
		case "±":
			return (passedNum * -1.0);
		default:
			return passedNum;
		}
	}

	

	/*
	 * = 버튼 눌렀을 때 작동할 함수.
	 * 이항연산자가 있는 경우 이항연산 후 연산자 비움.
	 * 단항연산자가 있는 경우 단항연산 후 연산자 비움.
	 */
	public Double finishCalculate(Double passedNum) {
		if (this.operator != null) {
			excecuteBinalCalc(passedNum, this.operator);
			this.operator = null;
			return this.numStack.peek();
		}
		return this.numStack.peek();
	}

	public boolean hasBinalOpt() {
		return this.operator != null;
	}


	@Override
	public String toString() {
		return "Logic2 [operator=" + operator + ", numStack=" + numStack + "]";
	}
}
