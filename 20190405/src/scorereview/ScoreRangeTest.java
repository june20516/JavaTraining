package scorereview;

import java.util.Scanner;

public class ScoreRangeTest {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private char grade = 'f';
	private Scanner keyIn;

	public ScoreRangeTest() {
		init();
	}

	public ScoreRangeTest(String name) {
		init();
		this.name = name;
	}
	
	public void init() {
		keyIn = new Scanner(System.in);
	}
	
	
	public void inputProc() {
		System.out.println("이름?");
		name = keyIn.nextLine();
		kor = subjectScore("국어");
		eng = subjectScore("영어");
		math = subjectScore("수학");
		
	}
	
	int temp;
	private int subjectScore(String subject) {
		System.out.println(subject + '?');
		temp = keyIn.nextInt();
		if(temp <0 || temp>100) 
			subjectScore(subject);
		return temp;
	}
	/*
	 * temp를 왜 바깥으로 빼놨을까?
	 */
	
	/*
	 * temp가 안에있는 경우 메소드가 실행 될 때 마다 temp라는 변수가 하나씩 선언된다. 재귀적으로 설계된 경우, 범위를 벗어난 입력이
	 * n번 발생한다면 n번의 재귀 호출이 발생하고, 각각의 temp가 아직 소멸되지도 않은 상태로 총 n개의 temp가 생기는 것이므로, 메모리
	 * 사용 면에서 매우 비효율적
	 */
	
	/*
	 * temp가 밖에 있는 경우 재귀 함수의 동작과는 별개로 temp가 선언되어 있으므로, 추가 호출에서 새로운 변수를 만들 필요가 없어서 위의
	 * 경우보다 효율적으로 메모리를 사용할 수 있다.
	 */
	
	
	
	
	
	
	private void calc() {
		total = kor + eng + math;
		avg = (double)total / 3.;
		/*
		if(avg >=90) grade = 'A';
		else if (avg>80) grade='B';
		else if (avg>70) grade='C';
		else if (avg>60) grade='D';
		*/
		char[] gCh = {'A','A','B','C','D'};
		
		if (avg>=60) grade = gCh[10-(int)avg/10];
		
	}
	
	
	
	/*
	 * 출력전담
	 * 이름 ~ 등급까지
	 */
	public void output() {
		
	}
	
	
	/*
	 * member data를 문자열로 return
	 */
	@Override
	public String toString() {
		return name+" , "+kor+" , "+eng+" , "+math+" , "+total+" , "+avg+" , "+grade;
	}
}
