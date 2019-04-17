package engineerinformationprocessing;

import java.util.HashMap;

/**
 * 이름
 * 응시번호
 * private 연락처
 * private e-mail
 * 전체답안[][]
 * 과목별 답안[]
 * int 과목별 점수
 * int 총점
 * double 평균
 * boolean 과목별 합/불합
 * 
 */
public class Applicant {
	
	 String name;
	 static int applicationCount;
	 int apllicationNum;
	 private int phoneNum;
	 private int email;
	 private int[] DBans = new int[20];	//데이터베이스 답안
	 private int[] ECSans = new int[20];	//전자계산기구조 답안
	 private int[] OSans = new int[20];	//운영체제 답안
	 private int[] SEans = new int[20];	//소프트웨어 공학 답안
	 private int[] DCans = new int[20];	//데이터 통신 답안
	 private int[][] totalAns = {DBans,ECSans,OSans,SEans,DCans};
	 private HashMap<String,Integer> scores = new HashMap<String,Integer>();
	 private int totalScore;
	 private boolean isPassing;
	 
}
