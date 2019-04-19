package calculator;

public class CalculateLogic {

	private int inputedNum1;
	private int inputedNum2;
	private String operator;

	public int getInputedNum1() {
		return inputedNum1;
	}

	public void setInputedNum1(int inputedNum1) {

		this.inputedNum1 = inputedNum1;
	}

	public int getInputedNum2() {
		return inputedNum2;
	}

	public void setInputedNum2(int inputedNum2) {

		this.inputedNum2 = inputedNum2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		if (operator != null)
			this.operator = operator;
	}

	// 계산 메소드
	public int calculate() {
		int result = 0;
		switch (operator) {
		case "+":
			result = inputedNum1 + inputedNum2;
			break;
		case "-":
			result = inputedNum1 - inputedNum2;
			break;
		case "*":
			result = inputedNum1 * inputedNum2;
			break;
		case "/":
			result = inputedNum1 / inputedNum2;
			break;
		case "%":
			result = inputedNum1 % inputedNum2;
			break;
		default:
			return result;
		}
		return result;
	}

}
