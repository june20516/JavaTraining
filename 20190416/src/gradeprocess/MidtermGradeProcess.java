package gradeprocess;

import java.util.ArrayList;
import java.util.Scanner;

public class MidtermGradeProcess {
	static Scanner keyIn = new Scanner(System.in);

	//학생 list 채우기
	static void inputStudentsOf(ArrayList<Student> students) {
		String repeat = "";
		System.out.println("학생정보를 입력합니다\n\r");
		do{			
			students.add(new Student());
			System.out.println("계속 입력하시겠습니까? y/n\n\r");
			repeat = keyIn.next().trim();
			System.out.println(repeat);
		}while(repeat.equals("y"));
	}
	
	//과목이름 list 채우기
	static void inputSubjectsOf(Exam exam) {
		String input = "";
		while (true) {
			System.out.println("과목을 입력해주세요. 종료:q\n\r");
			input = keyIn.next();
			if (input.equals( "q")) return;
			exam.setSubjects(input);
		}
	}
	
	public static void main(String[] args) {
		// 중간고사 인스턴스 생성
		Exam midtermExam = new Exam("midtermExam");
		//학생들 생성
		ArrayList<Student> BitCampStudents = new ArrayList<Student>();
		// 학생 입력
		inputStudentsOf(BitCampStudents);
		// 과목 입력
		inputSubjectsOf(midtermExam);
		// 학생들 시험봄
		doExam(midtermExam, BitCampStudents);
		System.out.println(midtermExam);
	}
	
	//학생들이 시험을 본다.
	public static void doExam(Exam exam, ArrayList<Student> students) {
		for (Student student : students) {
			System.out.printf("****%s이(가) 시험을 봤습니다.****\n\r",student.name);
			//응시자 명단에 이름을 올리자
			exam.setCandidate(student);
			//시험결과를 생성하자
			student.doExam(exam);
		}
		
	}
	
	
}
