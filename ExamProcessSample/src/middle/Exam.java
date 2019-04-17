package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
//시험명
	private String title;
//개인시험점수정보 목록
	private ArrayList<PersTestScoreInfo> persScoreList = new ArrayList<PersTestScoreInfo>();
	
	//학생개인정보
	private StudPersInfo studPersInfo;
	//시험점수정보
	private TestScoreInfo testScoreInfo;
	



//과목별 총점,평균
	private int[] subjectTotals;
//	private int korTotal = 0;
//	private int engTotal = 0;
//	private int mathTotal = 0;
//	private int scienceTotal = 0;
	
	private double[] subjectAvg;
//	private double korAvg = 0;
//	private double engAvg = 0;
//	private double mathAvg = 0;
//	private double scienceAvg = 0;

	
//   생성자(시험명)
	public Exam(String examName) {
		this.title = examName;
	}
	
//  입력처리메소드( 학생개인정보,  시험점수정보   ) 
//     1인분씩 데이타 들어온다 ==> 개인시험점수정보 목록에 추가
	public void inputInfo(String id, String name, String tel, String email, int kor, int eng, int math, int science) {
		studPersInfo = new StudPersInfo(id, name, tel, email);
		testScoreInfo = new TestScoreInfo(kor, eng, math, science);
		persScoreList.add(new PersTestScoreInfo(studPersInfo,testScoreInfo));
	}
	
	
	public void inputClose() {
		int count = persScoreList.get(0).getScoreInfo().countSubject();
		subjectTotals = new int[count];
		subjectAvg = new double[count];
	}
//
//     
//
  /**
  연산하는 부분()
  목록에 저장된 각 개인의 점수를 이용하여 총점과 평균과 학점을 구한다

  과목당 총점

  목록의 크기로 과목당 평균을 구할 수 있다

   */
	public void calcTotalFigure() {
		for (int subIdx = 0; subIdx < subjectTotals.length-1; subIdx++) {
				for(PersTestScoreInfo info : persScoreList) {
				subjectTotals[subIdx] += info.getScoreInfo().getSubjectScore()[subIdx];
				}
//				engTotal += persScoreList.get(idx).getScoreInfo().getEng();
//				mathTotal += persScoreList.get(idx).getScoreInfo().getMath();
//				scienceTotal += persScoreList.get(idx).getScoreInfo().getScience();
		}
		for (int subIdx = 0; subIdx < subjectTotals.length - 1; subIdx++) {
			subjectAvg[subIdx] = subjectTotals[subIdx] / persScoreList.size();
		}
//		engAvg = engTotal / persScoreList.size();
//		mathAvg = mathTotal / persScoreList.size();
//		scienceAvg = scienceTotal / persScoreList.size();
	}
	
	
//  석차      sort를 하지 않은 상태로?? 
//	public void rank() {
//		List sorted = persScoreList.sort();
//	}
     
//
// 출력처리메소드()
//
//     시험명에따라 다를수 있다면,
//
//     다르지 않다면 한 문장으로 만든다      
//	
}
