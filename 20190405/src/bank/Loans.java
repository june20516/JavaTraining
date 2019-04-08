package bank;

import java.util.Scanner;

public class Loans extends Bank {

	private String accountNumber = "250-";

	private static int count;
	// 고객명
	private String name;

	// 월 상환액
	private int loanAmount;

	// 기간
	private int period;

	// 총 대출액
	private int pureLoan;

	// 이율
	public static double rate = 3.5;

	// 이자액
	private int interestRate;

	// 총 상환액
	private long totalAmount;

	Scanner keyIn;

	public Loans() {
		// accountNumber = accountNumber + ++count;
		accountNumber += ++count;
		keyIn = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.println("이름?");
		name = keyIn.nextLine();

		System.out.println("기간?");
		period = keyIn.nextInt();

		System.out.println("총 대출액?");
		pureLoan = keyIn.nextInt();
	}

	private void calc() {
		input();
		interestRate = (int) (pureLoan * rate / 100);
		totalAmount = interestRate + pureLoan;
		loanAmount = (int) totalAmount / (12 * period);
	}

	@Override
	public String toString() {
		calc();
		return "Loans [accountNumber=" + accountNumber + ", name=" + name + ", loanAmount=" + loanAmount + ", period="
				+ period + ", pureLoan=" + pureLoan + ", interestRate=" + interestRate + ", totalAmount=" + totalAmount
				+ "]";
	}

}
