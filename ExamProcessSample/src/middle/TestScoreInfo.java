package middle;

import java.util.Arrays;

public class TestScoreInfo {
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int total;
	private double avg;
	private char grade;
	private int  rank;
	private int[] subjectScore;
	
	public TestScoreInfo() {
	
	}

	
	public int[] getSubjectScore() {
		return subjectScore;
	}


	public void setSubjectScore(int[] subjectScore) {
		this.subjectScore = subjectScore;
	}
	
	public int countSubject() {
		return subjectScore.length;
	}


	/**
	 * 
	 * 과목 이름 지우고 과목점수 배열로
	 * 
	 */
	
	
	public TestScoreInfo(int... subjects) {
		if (subjects != null) {
			subjectScore = subjects;
		}
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.science = science;
		calc();
	}





	public void calc() {
		
		//total =;
		//avg;
		//grade;
	}
	
	@Override
	public String toString() {
		return String.format("TestScoreInfo [total=%s, avg=%s, grade=%s, rank=%s, subjectScore=%s]", total, avg, grade,
				rank, Arrays.toString(subjectScore));
	}





	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calc();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calc();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		calc();
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
		calc();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
		calc();
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
		calc();
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
		calc();
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
		calc();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + eng;
		result = prime * result + grade;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + rank;
		result = prime * result + science;
		result = prime * result + total;
		return result;
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
		
		return  kor-other.kor  +  
				eng - other.eng + 
				math - other.math +
				science - other.science +
				total - other.total +
				avg - other.avg 
				==0 ;
		
		
		/*
		 * if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
		 * return false; if (eng != other.eng) return false; if (grade != other.grade)
		 * return false; if (kor != other.kor) return false; if (math != other.math)
		 * return false; if (rank != other.rank) return false; if (science !=
		 * other.science) return false; if (total != other.total) return false; return
		 * true;
		 */
	}
	
	
}






