package gradeprocess;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalScore {
	Scanner keyIn = new Scanner(System.in);
	//시험
	private Exam exam;
	//점수 맵
	Map<String,Integer> scores = new HashMap<String, Integer>();
	//각종 계산수치
	private int total;
	private double avg;
	private char grade;
	
	//constructers
	public PersonalScore() {	}
	public PersonalScore(Exam exam) {
		setExam(exam);
		setScoreMap();
		calc();
	}
	
	//점수 입력
	public void setScoreMap() {
		for (Subject subject : this.exam.getSubjects()) {
			System.out.printf("%s 의 점수를 입력하세요\n\r",subject.name);
			scores.put(subject.name, keyIn.nextInt());
		}
	}
	
	//setters
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	private void calc() {
		
	}
	
}
