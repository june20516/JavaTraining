package bank;

import java.util.Scanner;

public class Bank {
	
	public Bank() {}
	
	private String accountNumber;
	private static int count;
	
	//고객명
	private String name;

	//기간
	private int period;
	
	//총입금액
	private int total;
	
	//이율
	public static double rate;
	
	//입력 장치
	Scanner keyIn;
	
	//입력 메소드
	public void input() {
		System.out.println("이름?");
		name = keyIn.nextLine();

		System.out.println("기간?");
		period = keyIn.nextInt();
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", period=" + period + ", total=" + total
				+ "]";
	}
	
	
}
