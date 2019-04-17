package middle;

import java.util.Arrays;

public class ScoreInfo {
	private int total;
	private double avg;
	private char grade;
	private int  rank;
	private int[] subjectScores;
	private String[] subjectNames;
	
	//constructors
	public ScoreInfo(String[] subjectNames, int... subjectScores) {
		this.subjectNames = subjectNames;
		this.subjectScores = subjectScores;
	}
	public ScoreInfo(String...subjectNames) {
		this.subjectNames = subjectNames;
	}
	public ScoreInfo(int... subjectScore) {
		if (subjectScore != null) {
			subjectScores = subjectScore;
		}
		calc();
	}

	//과목 수 
	public int countSubject() {
		return subjectScores.length;
	}

	//계산하기 
	public void calc() {
		for (int score : subjectScores) {
			total += score;
		}
		avg = total / subjectScores.length;
		switch ((int) (avg / 10)) {
		case (10):
		case (9):
			grade = 'A';
		case (8):
			grade = 'B';
		case (7):
			grade = 'C';
		case (6):
			grade = 'D';
		default:
			grade = 'F';
		}
	}

	//getters
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
	public int getRank() {
		return rank;
	}
	public String[] getSubjectName() {
		return subjectNames;
	}
	public int[] getSubjectScore() {
		return subjectScores;
	}
	
	//setters
	public void setTotal(int total) {
		this.total = total;
		calc();
	}
	public void setAvg(double avg) {
		this.avg = avg;
		calc();
	}
	public void setGrade(char grade) {
		this.grade = grade;
		calc();
	}
	public void setRank(int rank) {
		this.rank = rank;
		calc();
	}
	public void setSubjectName(String... subjectName) {
		if (subjectName != null) {
		this.subjectNames = subjectName;
		}
		calc();
	}
	public void setSubjectScore(int... subjectScore) {
		if (subjectScore != null) {
		this.subjectScores = subjectScore;
		}
		calc();
	}
	
	@Override
	public String toString() {
		return String.format("TestScoreInfo [total=%s, avg=%s, grade=%s, rank=%s, subjectScore=%s]", total, avg, grade,
				rank, Arrays.toString(subjectScores));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreInfo other = (ScoreInfo) obj;
		
		return  total - other.total +
				avg - other.avg
				==0 ;
	}
	
	
}