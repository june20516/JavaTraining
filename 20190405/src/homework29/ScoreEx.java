package homework29;

import java.util.Scanner;

public class ScoreEx {
	
	
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
		kor = setScoreOf("국어");
		eng = setScoreOf("영어");
		math = setScoreOf("수학");
	}
	
	//계산
	public void calculateScores() {
		total = kor + eng + math;
		avg = (double)total / 3.;
		rateGrade();
	}
	
	private int setScoreOf(String subject) {
		int score;
		System.out.printf("%s 점수를 입력하세요 (0~100)\n",subject);
		score = sc.nextInt();
		while (score > 100 || score < 0) {
			System.out.println("점수 범위를 확인하고 다시 입력해주세요 (0~100)");
			score = sc.nextInt();
		}
		return score;
	}
	
	
	private void rateGrade() {
		char[] gradeTier = {'A','A','B','C','D'};
		grade = (int)(avg / 10.)>5 ? gradeTier[10-(int)(avg / 10.)] : 'F';
	}
	
	//출력
	public String toString() {
		return String.format("\t번호\t|\t이름\t|\t국어\t|\t영어\t|\t수학\t|\t총점\t|\t평균\t|\t등급\t|\n\t%d\t|\t%s\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%.2f\t|\t%c\t|\n", no, name, kor, eng, math, total, avg, grade);
	}
}
