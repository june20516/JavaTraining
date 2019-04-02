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
	
	//입력
	public void setValues() {
		System.out.println("번호를 입력하세요");
		no = sc.nextInt();
		System.out.println("이름을 입력하세요");
		name = sc.next();
		do {
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		} while(kor<0||kor>100);
		do {
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		} while(eng<0||eng>100);
		do {
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		} while(math<0||math>100);
	}
	
	//계산
	public void calculateScores() {
		total = kor + eng + math;
		avg = (double)total / 3.;
		rateGrade();
	}
	
	private void rateGrade() {
		if (avg>100 || avg<0) {
			System.out.print("입력값을 확인해주세요");
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
	
	//출력
	public void outputGrade() {
		System.out.println("\t번호\t|\t이름\t|\t국어\t|\t영어\t|\t수학\t|\t총점\t|\t평균\t|\t등급\t|");
		System.out.printf("\t%d\t|\t%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%.2f\t|\t%c\t|\n", no, name, kor, eng, math, total, avg, grade);
	}

}
