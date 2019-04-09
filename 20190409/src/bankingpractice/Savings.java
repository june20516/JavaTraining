package bankingpractice;

import java.util.Scanner;

public class Savings {
	// 계좌번호
	private String accountNumberStr;
	// 계좌 count
	private static int count;
	// 고객명
	private String customerName;
	// 입금원금
	private long depositAmount;
	// 이율 : BankCode에서 가져다 사용
	// 적금기간(년단위)
	private int period;
	// 총이자액
	private int interestRate;
	// 총금액=대출원금+이자액
	private long totalAmount;
	// 매월 넣어야 할 금액
	private long monthlyDeposit;

	private void creatAccountNum() {
		accountNumberStr = String.format("%s%05d", BankCode.SAVINGSPREFIX, ++count);
	}

	public Savings() {
		creatAccountNum();
		inputProc();
		calc();
	}

	// 이름 기간 대출금 입력
	public void inputProc() {
		Scanner keyIn = new Scanner(System.in);
		System.out.println("고객명");
		customerName = keyIn.nextLine();
		System.out.println("기간(년)");
		period = keyIn.nextInt();
		System.out.println("월입금액");
		monthlyDeposit = keyIn.nextLong();
	}


	private void calc() {
		//입금원금 = 월입금액 * 총개월수
		depositAmount = monthlyDeposit * period * 12;
		// interestRate => 이율, 원금
		interestRate = (int) (depositAmount * BankCode.SAVINGSRATE / 100);
		// 만기수령액 = 대출원금 + 이자액
		totalAmount = depositAmount + interestRate;
	}

	// 출력을 원할 때 출력할 수 있는 폼이 필요
	// 조회 (리턴 할 데이터가 무엇이 있는지?)
	public void output() {
		System.out.println("output()을 호출한 인스턴스" + this);
		System.out.println("고객명" + customerName);
		System.out.println("계좌번호 : " + accountNumberStr);
	}

	@Override
	public String toString() {
		return String.format(
				"Savings [accountNumberStr=%s, customerName=%s, depositAmount=%s, period=%s, interestRate=%s, totalAmount=%s, monthlyDeposit=%s]",
				accountNumberStr, customerName, depositAmount, period, interestRate, totalAmount, monthlyDeposit);
	}
}