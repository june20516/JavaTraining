package middle;

public class PersonalScoreInfo implements Comparable<PersonalScoreInfo> {
	//학생정보, 점수정보 
	private StudentInfo studentInfo;
	private ScoreInfo scoreInfo;
	
	//생성자 
	public PersonalScoreInfo() {
	}
	public PersonalScoreInfo(StudentInfo studPersInfo, ScoreInfo scoreInfo) {
		this.studentInfo = studPersInfo;
		this.scoreInfo = scoreInfo;
	}
	public StudentInfo getStudPersInfo() {
		return studentInfo;
	}
	
	//getters & setters
	public StudentInfo getStudentInfo() {
		return studentInfo;
	}
	public ScoreInfo getScoreInfo() {
		return scoreInfo;
	}
	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}
	public void setScoreInfo(ScoreInfo scoreInfo) {
		this.scoreInfo = scoreInfo;
	}
	
	@Override
	public String toString() {
		return String.format("PersTestScoreInfo [studPersInfo=%s, scoreInfo=%s]", studentInfo, scoreInfo);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scoreInfo == null) ? 0 : scoreInfo.hashCode());
		result = prime * result + ((studentInfo == null) ? 0 : studentInfo.hashCode());
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
		PersonalScoreInfo other = (PersonalScoreInfo) obj;
		if (scoreInfo == null) {
			if (other.scoreInfo != null)
				return false;
		} else if (!scoreInfo.equals(other.scoreInfo))
			return false;
		if (studentInfo == null) {
			if (other.studentInfo != null)
				return false;
		} else if (!studentInfo.equals(other.studentInfo))
			return false;
		return true;
	}
	@Override
	public int compareTo(PersonalScoreInfo o) {
		// TODO Auto-generated method stub
		return this.getScoreInfo().getTotal() - o.getScoreInfo().getTotal();
	}
	
}
