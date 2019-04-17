package use;

import middle.PersTestScoreInfo;
import middle.StudPersInfo;
import middle.TestScoreInfo;

public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * StudPersInfo [] infos = new StudPersInfo[3];
		 * System.out.println("infos==="+infos); for( StudPersInfo in : infos ) {
		 * System.out.println(in); }
		 */
		
		StudPersInfo info = 
				new StudPersInfo(
						"2019001", "김말자",
						"010-1234-5678", "aaa@aa.aa");
		StudPersInfo stut2 = new StudPersInfo(
				"2019001", "김말자",
				"010-1234-5678", "aaa@aa.aa");
		
		if(info.equals(stut2))System.out.println("동일한객체");
		else System.out.println("다른객체");
		
		TestScoreInfo scoreInfo = 
				new TestScoreInfo(90, 90, 90, 90);
		
		PersTestScoreInfo  studentTest = new PersTestScoreInfo(info, scoreInfo);
		
		System.out.println(studentTest.toString());
		
		
		
		
	}

}





