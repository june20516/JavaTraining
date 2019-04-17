package middle;

public class TestScoreInfo {
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int total;
	private double avg;
	private char grade;
	private int  rank;
	
	public TestScoreInfo() {
	
	}

	
	
	
	
	public TestScoreInfo(int kor, int eng, int math, int science) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		calc();
	}





	public void calc() {
		
		//total =;
		//avg;
		//grade;
	}
	@Override
	public String toString() {
		return String.format("TestScoreInfo [kor=%s, eng=%s, math=%s, science=%s, total=%s, avg=%s, grade=%s, rank=%s]",
				kor, eng, math, science, total, avg, grade, rank);
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		//calc();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
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






