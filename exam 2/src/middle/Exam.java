package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exam {
	private String title;
	private List<PersTestScoreInfo> studScoreList;
	private int[] subjectTotals;
	private double[] subjectAvgs;
	private int count;

	public Exam() {
	}

	public Exam(String title) {
		this.title = title;
		studScoreList = new ArrayList<>();
	}

	public void setStudScore(PersTestScoreInfo studScore) {
		studScoreList.add(studScore);
	}

	public void setStudScore(StudPersInfo studPersInfo, TestScoreInfo scoreInfo) {
		studScoreList.add(new PersTestScoreInfo(studPersInfo, scoreInfo));
	}

	public void inputClose() {
		count = studScoreList.get(0).getScoreInfo().subjectCount();
		subjectAvgs = new double[count];
		subjectTotals = new int[count];

		for (int i = 0; i < count; i++) {
			for (PersTestScoreInfo info : studScoreList) {
				subjectTotals[i] += info.getScoreInfo().getSubjectScore()[i];
			}
		}
		for (int i = 0; i < count; i++) {
			subjectAvgs[i] = subjectTotals[i] / studScoreList.size();
		}
		Collections.sort(studScoreList);
		
		for (int i = 0; i < studScoreList.size(); i++) {
			studScoreList.get(i).getScoreInfo().setRank(i + 1);
		}
	}

	@Override
	public String toString() {
		return String.format("Exam [title=%s, studScoreList=%s, subjectTotals=%s, subjectAvgs=%s]", title,
				studScoreList, Arrays.toString(subjectTotals), Arrays.toString(subjectAvgs));
	}

	public void output() {
		System.out.println("시험명 : " + title);
		PersTestScoreInfo info = null;
		for (String subjectName : TestScoreInfo.subjectNames) {
			System.out.print(subjectName);
		}
		System.out.println();
		for (int i = 0; i < studScoreList.size(); i++) {
			info = studScoreList.get(i);
			System.out.println(info);
		}
		for (int i = 0; i < count; i++) {
			System.out.print(this.subjectTotals[i] + ":" + this.subjectAvgs[i] + "\t");
		}
	}
}
