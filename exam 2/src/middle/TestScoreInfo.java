package middle;

import java.util.Arrays;

public class TestScoreInfo {
	public static String[] subjectNames;
	private int[] subjectScore;
	private int total;
	private double avg;
	private char grade;
	private int rank;

	public TestScoreInfo() {}

	public TestScoreInfo(String[] subjectNames, int... subjectScore) {
		this.subjectNames = subjectNames;
		this.subjectScore = subjectScore;
	}

	public TestScoreInfo(int... subjects) {
		// System.out.println("과목명을 입력해라");
		if (subjects != null) {
			subjectScore = subjects.clone();
			calc();
		}
	}

	public void calc() {
		total = subjectScore[0] + subjectScore[1] + subjectScore[2] + subjectScore[3];
		avg = total / 4.0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
	}

	@Override
	public String toString() {
		return String.format("TestScoreInfo [subjectScore=%s, total=%s, avg=%s, grade=%s, rank=%s]",
				Arrays.toString(subjectScore), total, avg, grade, rank);
	}

	public int[] getSubjectScore() {
		return subjectScore;
	}

	public String[] getSubjectNames() {
		return subjectNames;
	}

	static public void setSubjectNames(String... subjectNames) {
		TestScoreInfo.subjectNames = subjectNames;
	}

	public void setSubjectScore(int... subjectScore) {
		this.subjectScore = subjectScore;
	}

	public int subjectCount() {
		return subjectScore.length;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestScoreInfo other = (TestScoreInfo) obj;

		return total - other.total + avg - other.avg == 0;
	}
}
