package bankingpractice;

import java.util.Scanner;

/**
 * 
 * @author USER 신규통장개설, 1:적금 2:대출 3:신탁 4:자유저축 0:종료 원하는 작업은? 1번 ==> 적금 . . . 개설한다
 *         => 출력문이 온다
 * 
 *         계속하시겠습니가? n N ==>종료 // y Y ==> 재시작
 * 
 * 
 *         메인이 없고 메소드를 만들어야댄다
 * 
 */
public class BankBook {

	private static Scanner keyIn = new Scanner(System.in); // 입력에 사용할 scanner

	private static int inputValue() { // 서비스 번호 입력 메서드
		System.out.print("원하시는 서비스 번호를 입력하세요\n 1: 적금, 2: 대출, 3: 신탁예금, 0: 종료");
		return keyIn.nextInt();
	}

	private static boolean askContinue() {	//계속 할지 입력받는 메소드
		String yesOrNoStr = "";
		do {
			System.out.println("계속하시겠습니까? \nY(y) ==> 재시작, N(n) ==> 종료");
			yesOrNoStr = keyIn.next().toUpperCase();
			System.out.println(yesOrNoStr);
		} while (!yesOrNoStr.equals("Y") && !yesOrNoStr.equals("N"));
		return yesOrNoStr.equals("Y");
	}

	public void startService() {
		int serviceNum;
		do {
			serviceNum = inputValue(); // 서비스 선택, 각 서비스에 맞는 객체 생성
			switch (serviceNum) { // 서비스 번호에 따라 분기
			case 1:
				Savings savings = new Savings();
				System.out.println(savings);
				break;
			case 2:
				Loan loan = new Loan();
				System.out.println(loan);
				break;
			case 3:
				Trust trust = new Trust();
				System.out.println(trust);
				break;
			case 0:
				return; // 종료번호 입력시 서비스 메서드 종료
			default: // 지정된 번호 이외 입력시 서비스 번호 재입력
				System.out.println("입력값을 확인해주세요\n");
			}
		} while (askContinue()); // 서비스가 끝나면 다시 서비스 선택
	}

}
