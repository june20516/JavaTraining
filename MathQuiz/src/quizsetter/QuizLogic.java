package quizsetter;

public class QuizLogic {
	 
	private int inputedNum1;
	private int inputedNum2;
	private int result;
	private String operator;
	private String[] operators = {"+","-","*","/","%"};
	
	
	public QuizLogic() {
		setQuiz();
	}
	
	//퀴즈 요소를 가져오는 메소드 
	public String[] getQuiz() {
		setQuiz();
		String num1Str = Integer.toString(inputedNum1);
		String num2Str = Integer.toString(inputedNum2);
		String ansStr = Integer.toString(result);
		return new String[]{num1Str,operator,num2Str,ansStr};
	}
	
	//퀴즈 요소를 랜덤으로 만드는 메소드 
	private void setQuiz() {
		inputedNum1 = (int)(Math.random() * 10);
		inputedNum2 = (int)(Math.random() * 10);
		operator = operators[(int)(Math.random() * 4)];
		try{
			calculate();
		} catch(ArithmeticException e){
			setQuiz();
		}
	}
	
	//퀴즈 정답을 계산해 저장하는 메소드
	private void calculate() {
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
		default: break;
		}
	}
	
	//정답을 비교하여 결과를 전달하는 메소드
	public String compareAns(String userAns) {
		if (userAns.equals(Integer.toString(result))) {
			return "정답입니다!";
		}else {
			return String.format("틀렸어요~ 정답은 %d입니다.",result);
		}
	}

}
