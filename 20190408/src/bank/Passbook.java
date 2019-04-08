package bank;

import java.util.Scanner;

public class Passbook extends Bank{
	private String accountNumber = "450-";

	private static int count;
	
	// 고객명
	private String name;

	// 기간
	private int period;

	// 현잔액
	private int balance;

	// 이율
	public static double rate = 1.5;

	// 이자액
	private int interestRate;
	
	//거래내역
	private StringBuffer inOutLog = new StringBuffer("");

	Scanner keyIn;

	public Passbook() {
		// accountNumber = accountNumber + ++count;
		accountNumber += ++count;
		keyIn = new Scanner(System.in);
		input();
		startPassbookProcess();
	}

	
	private void startPassbookProcess() {
		while(true) {
			System.out.println("원하시는 업무를 선택해주세요. \n 0: 종료 1:입금 2: 출금 3: 내역확인");
			switch (keyIn.nextInt()) {
			case 0 : return;
			case 1 : this.deposit(); break;
			case 2 : this.withdraw(); break;
			case 3 : System.out.println(inOutLog); break;
			default : System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	@Override
	public void input() {
		System.out.println("이름?");
		name = keyIn.nextLine();

		System.out.println("기간?");
		period = keyIn.nextInt();
		
		System.out.println("첫 입금액?");
		balance = keyIn.nextInt();
	}
	
	//입금 메서드
	private void deposit() {
		System.out.println("얼마를 입금하시겠습니까?");
		int amount = keyIn.nextInt();
		balance += amount;
		String result = String.format("입금 : %d \n잔액 : %d \n\n", amount, balance);
		System.out.println(result);
		inOutLog.append(result);
	}
	
	//출금 메서드
	private void withdraw() {
		System.out.println("얼마를 출금하시겠습니까?");
		int amount = keyIn.nextInt();
		balance -= amount;
		String result = String.format("출금 : %d \n잔액 : %d \n\n", amount, balance);
		System.out.println(result);
		inOutLog.append(result);
	}

	@Override
	public String toString() {
		return "Passbook [accountNumber=" + accountNumber + ", name=" + name + ", period=" + period + ", balance="
				+ balance + ", interestRate=" + interestRate + ", \ninOutLog=" + inOutLog + "]";
	}


	
}
