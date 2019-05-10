package middle;

public class PersTestScoreInfo implements Comparable<PersTestScoreInfo>{
	private StudPersInfo studPersInfo;//studPersInfo = null;
	private TestScoreInfo scoreInfo;
	
	public PersTestScoreInfo() {
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
	public int compareTo(PersTestScoreInfo o) {
		if(this.getScoreInfo().getTotal()<o.getScoreInfo().getTotal()) {
			return 1;
		}else if(this.getScoreInfo().getTotal()==o.getScoreInfo().getTotal()) {
			
		}
		return -1;
		
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