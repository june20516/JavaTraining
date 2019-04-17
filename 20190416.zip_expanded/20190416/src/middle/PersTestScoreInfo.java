package middle;

public class PersTestScoreInfo {
	private StudPersInfo studPersInfo;//studPersInfo = null;
	//private StudPersInfo [] studPersIn;//studPersIn = null;
	//private StudPersInfo [] studPersIn2= new StudPersInfo[3];//studPersIn2 = null이 아님;
	private TestScoreInfo scoreInfo;
	
	public PersTestScoreInfo() {
		///????? studPersInfo =  new StudPersInfo();  or  
		//  studPersInfo = null;  현재상태
	}
	public PersTestScoreInfo(StudPersInfo studPersInfo, TestScoreInfo scoreInfo) {
		this.studPersInfo = studPersInfo;
		this.scoreInfo = scoreInfo;
	}
	public StudPersInfo getStudPersInfo() {
		return studPersInfo;
	}
	public void setStudPersInfo(StudPersInfo studPersInfo) {
		this.studPersInfo = studPersInfo;
	}
	public TestScoreInfo getScoreInfo() {
		return scoreInfo;
	}
	public void setScoreInfo(TestScoreInfo scoreInfo) {
		this.scoreInfo = scoreInfo;
	}
	@Override
	public String toString() {
		return String.format("PersTestScoreInfo [studPersInfo=%s, scoreInfo=%s]", studPersInfo, scoreInfo);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scoreInfo == null) ? 0 : scoreInfo.hashCode());
		result = prime * result + ((studPersInfo == null) ? 0 : studPersInfo.hashCode());
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
		PersTestScoreInfo other = (PersTestScoreInfo) obj;
		if (scoreInfo == null) {
			if (other.scoreInfo != null)
				return false;
		} else if (!scoreInfo.equals(other.scoreInfo))
			return false;
		if (studPersInfo == null) {
			if (other.studPersInfo != null)
				return false;
		} else if (!studPersInfo.equals(other.studPersInfo))
			return false;
		return true;
	}
	
}
