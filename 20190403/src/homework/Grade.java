package homework;

import java.util.Scanner;

public class Grade {
	
	private int no;
	private String name;
	private int kor; private int eng; private int math;
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
		System.out.println("국어 점수를 입력하세요 (0~100)");
		kor = sc.nextInt();
		} while(checkScore(kor));
		do {
		System.out.println("영어 점수를 입력하세요 (0~100)");
		eng = sc.nextInt();
		} while(checkScore(eng));
		do {
		System.out.println("수학 점수를 입력하세요 (0~100)");
		math = sc.nextInt();
		} while(checkScore(math));
	}
	
	//계산
	public void calculateScores() {
		total = kor + eng + math;
		avg = (double)total / 3.;
		rateGrade();
	}
	
	private boolean checkScore(int score) {
		if (score<0 || score>100) {
			System.out.println("점수 범위를 확인해주세요");
		}
		return (score<0||score>100);
	}
	
	
	private void rateGrade() {
		char[] gradeTier = {'A','A','B','C','D'};
		grade = (int)(avg / 10.)>5 ? gradeTier[10-(int)(avg / 10.)] : 'F';
	}
	
	//출력
	public void outputGrade() {
		System.out.println("\t번호\t|\t이름\t|\t국어\t|\t영어\t|\t수학\t|\t총점\t|\t평균\t|\t등급\t|");
		System.out.printf("\t%d\t|\t%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%.2f\t|\t%c\t|\n", no, name, kor, eng, math, total, avg, grade);
	}
}
