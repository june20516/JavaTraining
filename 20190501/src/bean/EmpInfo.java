package bean;

import java.sql.Date;

public class EmpInfo {

	private int empNo;
	private String empName;
	private String job;
	private Date hireDate;
	private int sal;
	private int deptNo;
	private String deptName;
	private String deptLocal;
	public EmpInfo(int empNo, String empName, String job, Date hireDate, int sal, int deptNo, String deptName,
			String deptLocal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.hireDate = hireDate;
		this.sal = sal;
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLocal = deptLocal;
	}
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
		return String.format("%4d %14s %8s %5s %,10d %8s %8s",empNo,empName,job,hireDate,sal,deptName,deptLocal);
	}
	
}
