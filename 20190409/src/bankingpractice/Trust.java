package bankingpractice;

import java.util.Scanner;

public class Trust {
	// 계좌번호
	private String accountNumberStr;
	// 계좌 count
	private static int count;
	// 고객명
	private String customerName;
	// 입금원금
	private long trustAmount;
	// 이율 : BankCode에서 가져다 사용
	// 적금기간(년단위)
	private int period;
	
	//년이자액 = 원금 * 이율 / 100
	//월이자액 = 년이자액 / 12
	private int monthlyInterest;
	//총이자액 = 년이자액 * period
	private int interestRate;

	// 총금액= 원금 + 총이자액
	private long totalAmount;


	private void creatAccountNum() {
		accountNumberStr = String.format("%s%05d", BankCode.TRUSTPREFIX, ++count);
	}

	public Trust() {
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
		System.out.println("맡기실 금액");
		trustAmount = keyIn.nextLong();
	}

	// 년이자, 월이자액, 만기시 총액
	private void calc() {
		//연이자
		double yearInterest = trustAmount * BankCode.TRUSTRATE / 100;
		//총이자액
		interestRate = (int)(yearInterest * period);
		//월이자액
		monthlyInterest = (int)(yearInterest / 12);
		// 만기수령액 = 대출원금 + 이자액
		totalAmount = trustAmount + interestRate;
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
				"Trust [accountNumberStr=%s, customerName=%s, trustAmount=%s, period=%s, monthlyInterest=%s, trust rate = %.2f%%, interestRate=%s, totalAmount=%s]",
				accountNumberStr, customerName, trustAmount, period, monthlyInterest, BankCode.TRUSTRATE, interestRate, totalAmount);
	}
}