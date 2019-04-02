package HomeWorks;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Installment {
	
	private Scanner sc = new Scanner(System.in);
	
	private String name;	//����
	private long account;	//����
	private int monDeposit;	//�����Ծ�
	private GregorianCalendar startDate = new GregorianCalendar();	//������
	private GregorianCalendar expiryDate = new GregorianCalendar();	//������
	private int yearPeriod;	//�Ⱓ(��)
	private double interestRate = 0.02;	//������
	private int principal;	//����
	private int interestAmount;	//���ھ�
	private int refundAmount;	//�����ȯ�޾�
	
	//�Է�
	public void inputDatas() {
		System.out.println("���� : ");
		name = sc.next();
		System.out.println("���¹�ȣ(���ڸ�) : ");
		account = sc.nextLong();
		System.out.println("�����Ծ� : ");
		monDeposit = sc.nextInt();
		System.out.println("���ԱⰣ(��) : ");
		yearPeriod = sc.nextInt();
		System.out.println("������ (YYYY MM DD) : ");
		startDate.set(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	public void setInterestRate() {
		System.out.println("������ ������ : ");
		interestRate = sc.nextDouble();
		System.out.printf("�������� %.3d���� ����Ǿ����ϴ�.", interestRate);
	}
	
	//���
	public void calculateRefundAmount() {
		expiryDate.set(startDate.get(GregorianCalendar.YEAR)+yearPeriod, startDate.get(GregorianCalendar.MONTH), startDate.get(GregorianCalendar.DATE));
		principal = monDeposit * (yearPeriod*12);
		interestAmount = (int)((double)principal * interestRate);
		refundAmount = principal + interestAmount;
	}
	
	//���
	public void output() {
		System.out.println(" ����  | ���¹�ȣ\t | \t����\t |  ����  |    ���ھ�  | ����ȯ�޾�  | \t\t������\t|");
		System.out.printf(" %3s  | %13d | %13d | %.3f  | %10d | %11d | %d�� %d�� %d��\t|\n", 
				name, account, principal, interestRate, interestAmount, refundAmount, expiryDate.get(GregorianCalendar.YEAR), expiryDate.get(GregorianCalendar.MONTH), expiryDate.get(GregorianCalendar.DATE));
	}
}
