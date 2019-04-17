package use;

import middle.PersonalScoreInfo;
import middle.StudentInfo;
import middle.ScoreInfo;

public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * StudPersInfo [] infos = new StudPersInfo[3];
		 * System.out.println("infos==="+infos); for( StudPersInfo in : infos ) {
		 * System.out.println(in); }
		 */
		
		StudentInfo info = 
				new StudentInfo(
						"2019001", "김말자",
						"010-1234-5678", "aaa@aa.aa");
		StudentInfo stut2 = new StudentInfo(
				"2019001", "김말자",
				"010-1234-5678", "aaa@aa.aa");
		
		if(info.equals(stut2))System.out.println("동일한객체");
		else System.out.println("다른객체");
		
		ScoreInfo scoreInfo = 
				new ScoreInfo(90, 90, 90, 90);
		
		PersonalScoreInfo  studentTest = new PersonalScoreInfo(info, scoreInfo);
		
		System.out.println(studentTest.toString());
		
		
		
		
	}

}





