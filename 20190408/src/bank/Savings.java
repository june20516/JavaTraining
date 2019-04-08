package bank;

import java.util.Scanner;

//적금
public class Savings extends Bank {
	
	private String accountNumber="150-";
	private static int count;
	//고객명
	private String name;
	//월입금액
	private int depoAmount;
	//기간
	private int period;
	//총입금액
	private int total;
	//이율
	public static double rate = 3.5;
	//이자액
	private int interestRate;
	//만기시입금액
	private long totalAmount;
	
	Scanner keyIn;
	
	
	public Savings()  {
		//accountNumber = accountNumber + ++count;
		accountNumber += ++count;
		keyIn = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.println("이름?");
		name = keyIn.nextLine();

		System.out.println("기간?");
		period = keyIn.nextInt();
	
		System.out.println("월입금액?");
		depoAmount = keyIn.nextInt();
	}

    private void calc() {
    	input();
    	total = period * 12 * depoAmount;
    	interestRate = (int)(total * rate/100);
    	totalAmount = interestRate + total;
    }
	
	
	@Override
	public String toString() {
		calc();
		return "Savings [accountNumber=" + accountNumber + ", name=" + name + ", depoAmount=" + depoAmount + ", period="
				+ period + ", total=" + total + ", interestRate=" + interestRate + ", totalAmount=" + totalAmount
				+ ", keyIn=" + keyIn + "]";
	}

}



