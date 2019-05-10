package use;

import middle.Exam;
import middle.PersTestScoreInfo;
import middle.StudPersInfo;
import middle.TestScoreInfo;

public class StartClass {

	public static void main(String[] args) {

		StudPersInfo stud1 = new StudPersInfo("김말자", "010-1234-5678", "aaa@aa.aa");
		StudPersInfo stud2 = new StudPersInfo("박말자", "010-1234-5678", "aaa@aa.aa");

		TestScoreInfo.setSubjectNames("국어", "영어", "수학", "과학");
		TestScoreInfo stud1ScoreInfo = new TestScoreInfo(90, 90, 90, 90);
		TestScoreInfo stud2ScoreInfo = new TestScoreInfo(10, 20, 30, 40);
		
		PersTestScoreInfo studentTest1 = new PersTestScoreInfo(stud1, stud1ScoreInfo);
		PersTestScoreInfo studentTest2 = new PersTestScoreInfo(stud2, stud2ScoreInfo);

		Exam exam = new Exam("중간고사");
		exam.setStudScore(studentTest1);
		exam.setStudScore(studentTest2);
		exam.inputClose();
		exam.output();
		
	}
}
