package HomeWorks;

import java.util.Scanner;

public class Grade {
	private int no;
	private String name;
	private int kor; int eng; int math;
	private int total;
	private double avg;
	private char grade;
	
	private Scanner sc = new Scanner(System.in);
	
	//�Է�
	public void setValues() {
		System.out.println("��ȣ�� �Է��ϼ���");
		no = sc.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		do {
		System.out.println("���� ������ �Է��ϼ���");
		kor = sc.nextInt();
		} while(kor<0||kor>100);
		do {
		System.out.println("���� ������ �Է��ϼ���");
		eng = sc.nextInt();
		} while(eng<0||eng>100);
		do {
		System.out.println("���� ������ �Է��ϼ���");
		math = sc.nextInt();
		} while(math<0||math>100);
	}
	
	//���
	public void calculateScores() {
		total = kor + eng + math;
		avg = (double)total / 3.;
		rateGrade();
	}
	
	private void rateGrade() {
		if (avg>100 || avg<0) {
			System.out.print("�Է°��� Ȯ�����ּ���");
		}else {
			switch ((int)(avg/10.)) {
			case 10 :
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F';
			}
		}
	}
	
	//���
	public void outputGrade() {
		System.out.println("\t��ȣ\t|\t�̸�\t|\t����\t|\t����\t|\t����\t|\t����\t|\t���\t|\t���\t|");
		System.out.printf("\t%d\t|\t%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%.2f\t|\t%c\t|\n", no, name, kor, eng, math, total, avg, grade);
	}

}
