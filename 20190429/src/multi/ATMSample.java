package multi;

import java.util.Scanner;

public class ATMSample implements Runnable {
	private int depositeMoney = 100000;
	private String useName ; 
	private Scanner in = new Scanner(System.in);

	// 현재 잔액을 알기 위한 메소드
	public int getDepositeMoney() {
		return depositeMoney;
	}

	synchronized public void withDraw(int howMuch) {
		// howMuch 이 잔액보다 많은지 확인 
		if (depositeMoney < howMuch) {
			// 잔액이 작으면 잔액이 부족하다라고 메시지를 출력 하고 인출을 하면 안된다.
			System.err.println(useName + "님 잔액부족입니다");
		} else {
			// 인출금액이 같거나 작으면 인출 , 잔액에서 원하는 금액을 뺀다
			depositeMoney -= howMuch;
			// 얼마가 인출되었고 잔액은 얼마가 남았다.
			System.out.printf(useName + "님 찾은 금액 %,9d원 , 잔액 : %,9d원 \n\r", howMuch, depositeMoney);
		}
		notifyAll();
	}



	@Override

	public void run() {
		while (depositeMoney > 0) {
			synchronized (this) {
				try {
					useName = Thread.currentThread().getName();
					System.out.printf("현재 잔액은 %,9d원 입니다 %n",depositeMoney);
					System.out.print(useName+"님 찾으실 금액은?");
					withDraw(in.nextInt());
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}