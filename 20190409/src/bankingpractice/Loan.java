package bankingpractice;

import java.util.Scanner;

public class Loan {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumberStr == null) ? 0 : accountNumberStr.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + interestRate;
		result = prime * result + (int) (monthlyPayment ^ (monthlyPayment >>> 32));
		result = prime * result + period;
		result = prime * result + (int) (principal ^ (principal >>> 32));
		result = prime * result + (int) (totalAmount ^ (totalAmount >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (accountNumberStr == null) {
			if (other.accountNumberStr != null)
				return false;
		} else if (!accountNumberStr.equals(other.accountNumberStr))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (interestRate != other.interestRate)
			return false;
		if (monthlyPayment != other.monthlyPayment)
			return false;
		if (period != other.period)
			return false;
		if (principal != other.principal)
			return false;
		if (totalAmount != other.totalAmount)
			return false;
		return true;
	}

	// 계좌번호
	private String accountNumberStr;
	// 계좌 count
	private static int count;
	// 고객명
	private String customerName;
	// 원금
	private long principal;
	// 이율 : BankCode에서 가져다 사용
	// 대출기간(년단위)
	private int period;
	// 총이자액
	private int interestRate;
	// 총금액=대출원금+이자액
	private long totalAmount;
	// 매월 갚아야할 금액
	private long monthlyPayment;

	private void creatAccountNum() {
		accountNumberStr = String.format("%s%05d", BankCode.LOANPREFIX, ++count);
	}

	public Loan() {
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
		System.out.println("대출금액");
		principal = keyIn.nextLong();
	}

	// 입력후에는 이자, 월상환액을 계산
	private void calc() {
		// interestRate => 이율, 원금, 기간
		interestRate = (int) (principal * BankCode.LOANRATE / 100);
		// 총금액 = 대출원금 + 이자액
		totalAmount = principal + interestRate;
		// 총금액 / 기간*12 매달갚는다
		// 매월 갚아야할 금액
		monthlyPayment = totalAmount / (period * 12);
	}

	// 출력을 원할 때 출력할 수 있는 폼이 필요
	// 조회 (리턴 할 데이터가 무엇이 있는지?)
	public void output() {
		System.out.println("output()을 호출한 인스턴스" + this);
		System.out.println("고객명" + customerName);
		System.out.println("계좌번호 : " + accountNumberStr);
		System.out.println(accountNumberStr);
	}

	@Override
	public String toString() {
		return String.format(
				"Loan [accountNumberStr=%s, customerName=%s, principal=%s, period=%s, interestRate=%s, totalAmount=%s, monthlyPayment=%s]",
				accountNumberStr, customerName, principal, period, interestRate, totalAmount, monthlyPayment);
	}

}