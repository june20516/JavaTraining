package HomeWorks;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Loan {
private Scanner sc = new Scanner(System.in);
	
	private String name;	//����
	private long account;	//����
	private int loanAmount;	//�����
	private GregorianCalendar loanDate = new GregorianCalendar();	//������
	private GregorianCalendar expiryDate = new GregorianCalendar();	//������
	private int yearPeriod;	//�Ⱓ(��)
	private double interestRate = 0.2;	//������
	private int interest;	//���ھ�
	private int totalRepayment;	//������
	private int monthRepayment;	//�����Ա�
	
	//�Է�
	public void inputDatas() {
		System.out.println("���� : ");
		name = sc.next();
		System.out.println("���¹�ȣ(���ڸ�) : ");
		account = sc.nextLong();
		System.out.println("����� : ");
		loanAmount = sc.nextInt();
		System.out.println("��ȯ�Ⱓ(��) : ");
		yearPeriod = sc.nextInt();
		System.out.println("������ (YYYY MM DD) : ");
		loanDate.set(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	public void setInterestRate() {
		System.out.println("������ ������ : ");
		interestRate = sc.nextDouble();
		System.out.printf("�������� %.3d���� ����Ǿ����ϴ�.", interestRate);
	}
	
	//���
	public void calculateMonthlyRepayment() {
		expiryDate.set(loanDate.get(GregorianCalendar.YEAR)+yearPeriod, loanDate.get(GregorianCalendar.MONTH), loanDate.get(GregorianCalendar.DATE));
		interest = (int)((double)loanAmount * interestRate);
		totalRepayment = loanAmount + interest;
		monthRepayment = totalRepayment/(yearPeriod*12); 
		
	}
	
	//���
	public void output() {
		System.out.println(" ���� | ���¹�ȣ\t | \t�������   | ����  | \t���ھ�\t | \t�ѻ�ȯ�ݾ�\t | \t����ȯ��\t | \t�����ȯ��\t|");
		System.out.printf(" %3s | %14d | %15d | %.3f  | %d\t | \t%d\t| \t%d\t\t | \t%d�� %d�� %d��\t|\n", 
				name, account, loanAmount, interestRate, interest, totalRepayment, monthRepayment, expiryDate.get(GregorianCalendar.YEAR), expiryDate.get(GregorianCalendar.MONTH), expiryDate.get(GregorianCalendar.DATE));
	}
}
