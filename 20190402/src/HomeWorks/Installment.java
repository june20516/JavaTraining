package HomeWorks;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Installment {
	
	private Scanner sc = new Scanner(System.in);
	
	private String name;	//고객명
	private long account;	//계좌
	private int monDeposit;	//월납입액
	private GregorianCalendar startDate = new GregorianCalendar();	//시작일
	private GregorianCalendar expiryDate = new GregorianCalendar();	//만기일
	private int yearPeriod;	//기간(년)
	private double interestRate = 0.02;	//이자율
	private int principal;	//원금
	private int interestAmount;	//이자액
	private int refundAmount;	//만기시환급액
	
	//입력
	public void inputDatas() {
		System.out.println("고객명 : ");
		name = sc.next();
		System.out.println("계좌번호(숫자만) : ");
		account = sc.nextLong();
		System.out.println("월납입액 : ");
		monDeposit = sc.nextInt();
		System.out.println("가입기간(년) : ");
		yearPeriod = sc.nextInt();
		System.out.println("가입일 (YYYY MM DD) : ");
		startDate.set(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	public void setInterestRate() {
		System.out.println("변경할 이자율 : ");
		interestRate = sc.nextDouble();
		System.out.printf("이자율이 %.3d으로 변경되었습니다.", interestRate);
	}
	
	//계산
	public void calculateRefundAmount() {
		expiryDate.set(startDate.get(GregorianCalendar.YEAR)+yearPeriod, startDate.get(GregorianCalendar.MONTH), startDate.get(GregorianCalendar.DATE));
		principal = monDeposit * (yearPeriod*12);
		interestAmount = (int)((double)principal * interestRate);
		refundAmount = principal + interestAmount;
	}
	
	//출력
	public void output() {
		System.out.println(" 고객명  | 계좌번호\t | \t원금\t |  이율  |    이자액  | 만기환급액  | \t\t만기일\t|");
		System.out.printf(" %3s  | %13d | %13d | %.3f  | %10d | %11d | %d년 %d월 %d일\t|\n", 
				name, account, principal, interestRate, interestAmount, refundAmount, expiryDate.get(GregorianCalendar.YEAR), expiryDate.get(GregorianCalendar.MONTH), expiryDate.get(GregorianCalendar.DATE));
	}
}
