package multithread;

import java.util.Scanner;

public class ATMSample implements Runnable {
	Scanner keyIn = new Scanner(System.in);
	
	private int depositMoney = 100000000;

	public int getDepositMoney() {
		return depositMoney;
	}

	synchronized public void withDraw(int howMuch) {
		if (depositMoney >= howMuch) {
			depositMoney -= howMuch;
			System.out.printf("찾은 금액 : %d 원 \n잔액 : %d 원 \n", howMuch, depositMoney);
		} else {
			System.err.println("잔액부족");
		}
	}

	@Override
	public void run() {
		synchronized (this) {
			while (this.getDepositMoney() > 0) {
				try {
					wait(500);
				} catch (Exception e) {
					e.printStackTrace();
					notify();
				}
				System.out.printf("\n%s이(가) 출금합니다\n", Thread.currentThread().getName());
				withDraw(keyIn.nextInt());
			}
		}
	}
}
