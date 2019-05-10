package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;;

public class JDBCControl {
	private Connection connection;
	private PreparedStatement prepStat;
	private ResultSet rsSet;
	
	public JDBCControl() {
		connection = JDBCConnection.getConnection();
	}
	
	
	public List<EmpInfo> getEmpInfo() {
		List<EmpInfo> empInfos = new ArrayList<EmpInfo>();
		String sql = "SELECT EMPNO, EMPNAME, JOB, HIREDATE, SAL, e.DEPTNO, DEPTNAME, DEPTLOCAL from emp e, dept d where e.DEPTNO=d.DEPTNO";
		try {
			prepStat = connection.prepareStatement(sql);
			rsSet = prepStat.executeQuery();
			while(rsSet.next()) {
				empInfos.add(new EmpInfo(
						rsSet.getInt(1), 
						rsSet.getString(2), 
						rsSet.getString(3), 
						rsSet.getDate(4), 
						rsSet.getInt(5), 
						rsSet.getInt(6), 
						rsSet.getString(7), 
						rsSet.getString(8)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empInfos;
	}
	
	public EmpInfo getEmpInfo(String empNo) {
		EmpInfo empInfo = null;
		String sql = "select EMPNO, EMPNAME, JOB, HIREDATE, SAL, e.DEPTNO, DEPTNAME, DEPTLOCAL from emp e, dept d where e.DEPTNO=d.DEPTNO and e.EMPNO=?";
		
		try {
			prepStat = connection.prepareStatement(sql);
			prepStat.setInt(1, Integer.parseInt(empNo));
			rsSet = prepStat.executeQuery();
			if(rsSet.next()) {
				empInfo = new EmpInfo(Integer.parseInt(empNo), rsSet.getString(2), rsSet.getString(3), rsSet.getDate(4), rsSet.getInt(5), rsSet.getInt(6), rsSet.getString(7), rsSet.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empInfo;
	}
}
