package HomeWorks;

public class HomeWork {

	public static void main(String[] args) {
		//1. 점수
		Grade student = new Grade();
		student.setValues();
		student.calculateScores();
		student.outputGrade();
		
		//2. 적금
		Installment kakaoBank = new Installment();
		kakaoBank.inputDatas();
		kakaoBank.calculateRefundAmount();
		kakaoBank.output();
		
		//3. 대출
		Loan rushNCash = new Loan();
		rushNCash.inputDatas();
		rushNCash.calculateMonthlyRepayment();
		rushNCash.output();
		
	}

}
