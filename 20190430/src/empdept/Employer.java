package empdept;

import java.sql.Date;

public class Employer {

	int empNo;
	String empName;
	String job;
	Date hireDate;
	int sal;
	int deptNo;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "Employer [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", hireDate=" + hireDate
				+ ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}
	
	public Employer(int empNo, String empName, String job, Date hireDate, int sal, int deptNo) {
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.hireDate = hireDate;
		this.sal = sal;
		this.deptNo = deptNo;
	}
	
	public Employer(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
		
	}
	
}
