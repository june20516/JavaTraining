package middle;

import java.util.ArrayList;
import java.util.Collections;


public class Exam {
//시험명
	private String title;
//개인시험점수정보 목록
	private ArrayList<PersonalScoreInfo> personalScoreList = new ArrayList<PersonalScoreInfo>();
	
	//학생개인정보
	private StudentInfo studPersInfo;
	//시험점수정보
	private ScoreInfo testScoreInfo;
	



//과목별 총점,평균
	private int[] subjectTotals;
	
	private double[] subjectAvg;
	
//   생성자(시험명)
	public Exam(String examName) {
		this.title = examName;
	}
	
//  입력처리메소드( 학생개인정보,  시험점수정보   ) 
//     1인분씩 데이타 들어온다 ==> 개인시험점수정보 목록에 추가
	public void inputInfo(String id, String name, String tel, String email, int kor, int eng, int math, int science) {
		studPersInfo = new StudentInfo(id, name, tel, email);
		testScoreInfo = new ScoreInfo(kor, eng, math, science);
		personalScoreList.add(new PersonalScoreInfo(studPersInfo,testScoreInfo));
	}
	
	
	public void inputClose() {
		int count = personalScoreList.get(0).getScoreInfo().countSubject();
		subjectTotals = new int[count];
		subjectAvg = new double[count];
	}
//
//     
//
	
	public void calcTotalFigure() {
		for (int subIdx = 0; subIdx < subjectTotals.length-1; subIdx++) {
				for(PersonalScoreInfo info : personalScoreList) {
				subjectTotals[subIdx] += info.getScoreInfo().getSubjectScore()[subIdx];
				}
		}
		for (int subIdx = 0; subIdx < subjectTotals.length - 1; subIdx++) {
			subjectAvg[subIdx] = subjectTotals[subIdx] / personalScoreList.size();
		}
	}
	
	

	public void rank() {
		Collections.sort(personalScoreList);
		
	}
}
