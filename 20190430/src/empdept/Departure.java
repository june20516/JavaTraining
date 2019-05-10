package empdept;

public class Departure {

	int deptNo;
	String deptName;
	String deptLocal;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocal() {
		return deptLocal;
	}
	public void setDeptLocal(String deptLocal) {
		this.deptLocal = deptLocal;
	}
	@Override
	public String toString() {
		return "Departure [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLocal=" + deptLocal + "]";
	}
	
	public Departure(int deptNo, String deptName, String deptLocal) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLocal = deptLocal;
	}
	
	
	
}
