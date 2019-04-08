package bank;

import java.util.Scanner;

/*
 * 원하는 서비스를 선택하여 
 * 입력값을 받고 출력할 수 있도록
 */

public class SavingsUse1 {

	private static Scanner stdIn = new Scanner(System.in);	//입력에 사용할 scanner
	private static Bank customer;	//서비스 이용자 객체

	private static int inputValue() {	// 서비스 번호 입력 메서드
		System.out.print("원하시는 서비스 번호를 입력하세요\n 1: 적금, 2: 대출, 3: 자유저축, 0: 종료");
		return stdIn.nextInt();
	}

	private static void startService() {
		int serviceNum;
		do {
			serviceNum = inputValue();	//서비스 선택, 각 서비스에 맞는 객체 생성
			switch (serviceNum) {	//서비스 번호에 따라 분기
			case 1:
				customer = new Savings();
				break;
			case 2:
				customer = new Loans();
				break;
			case 3:
				customer = new Passbook();
				break;
			case 0:
				return;	//종료번호 입력시 서비스 메서드 종료
			default:	//지정된 번호 이외 입력시 서비스 번호 재입력
				System.out.println("입력값을 확인해주세요\n");
			}
			System.out.println(customer);	//스위치에서 이용자 인스턴스 생성된 후, 서비스 결과 출력
		}while (true); //서비스가 끝나면 다시 서비스 선택
	}

	public static void main(String[] args) {
		startService();
	}
}
