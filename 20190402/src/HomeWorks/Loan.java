package HomeWorks;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Loan {
private Scanner sc = new Scanner(System.in);
	
	private String name;	//고객명
	private long account;	//계좌
	private int loanAmount;	//대출금
	private GregorianCalendar loanDate = new GregorianCalendar();	//시작일
	private GregorianCalendar expiryDate = new GregorianCalendar();	//만기일
	private int yearPeriod;	//기간(년)
	private double interestRate = 0.2;	//이자율
	private int interest;	//이자액
	private int totalRepayment;	//원리금
	private int monthRepayment;	//월납입금
	
	//입력
	public void inputDatas() {
		System.out.println("고객명 : ");
		name = sc.next();
		System.out.println("계좌번호(숫자만) : ");
		account = sc.nextLong();
		System.out.println("대출금 : ");
		loanAmount = sc.nextInt();
		System.out.println("상환기간(년) : ");
		yearPeriod = sc.nextInt();
		System.out.println("대출일 (YYYY MM DD) : ");
		loanDate.set(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	public void setInterestRate() {
		System.out.println("변경할 이자율 : ");
		interestRate = sc.nextDouble();
		System.out.printf("이자율이 %.3d으로 변경되었습니다.", interestRate);
	}
	
	//계산
	public void calculateMonthlyRepayment() {
		expiryDate.set(loanDate.get(GregorianCalendar.YEAR)+yearPeriod, loanDate.get(GregorianCalendar.MONTH), loanDate.get(GregorianCalendar.DATE));
		interest = (int)((double)loanAmount * interestRate);
		totalRepayment = loanAmount + interest;
		monthRepayment = totalRepayment/(yearPeriod*12); 
		
	}
	
	//출력
	public void output() {
		System.out.println(" 고객명 | 계좌번호\t | \t대출원금   | 이율  | \t이자액\t | \t총상환금액\t | \t월상환금\t | \t만기상환일\t|");
		System.out.printf(" %3s | %14d | %15d | %.3f  | %d\t | \t%d\t| \t%d\t\t | \t%d년 %d월 %d일\t|\n", 
				name, account, loanAmount, interestRate, interest, totalRepayment, monthRepayment, expiryDate.get(GregorianCalendar.YEAR), expiryDate.get(GregorianCalendar.MONTH), expiryDate.get(GregorianCalendar.DATE));
	}
}
