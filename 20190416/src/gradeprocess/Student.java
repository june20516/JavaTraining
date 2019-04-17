package gradeprocess;

import java.util.Scanner;

public class Student {
	Scanner keyInput = new Scanner(System.in);	
	String name;
	private String phoneNum;
	String studentID = "2019-";
	static int count;
	PersonalScore examResult;
	
	private void setStudentInfo() {
		System.out.println("이름, 연락처를 쉼표로 구분하여 입력해주세요\n\r");
		String rawInput = keyInput.next();
		name = rawInput.split(",")[0].trim(); 
		phoneNum = rawInput.split(",")[1].trim();
	}
	
	private void setID() {
		studentID += String.format("%04d", ++count);
	}
	
	public Student() {
		setStudentInfo();
		setID();
	}
	
	public Student(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public void doExam(Exam exam) {
		// 시험을 본다음 과목별로 점수를 넣는다
		this.examResult = new PersonalScore(exam);
	}

	@Override
	public String toString() {
		return String.format("%s, studentID = %s", name, studentID);
	}
		
	
}