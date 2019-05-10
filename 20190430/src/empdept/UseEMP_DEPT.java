package empdept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UseEMP_DEPT {

	/*
	 * 1. 사원번호가 145번인 사원의 정보를 출력하세요. 
	 * 2. 부서코드가 20번인 사원의 평균연봉을 출력하세요.   
	 * 3. 개발부의 근무지를 출력하세요.
	 * 4. 부서코드가 22인 사원의 이름과 연봉과 부서명을 출력하세요.
	 * 5. 2015년에 입사한 사람은?
	 */
	public static void main(String[] args){
		/*
		 * 공통으로 사용할 환경 설정
		 */
		Connection connection;
	
		/*
		 * 1. 사원번호가 145번인 사원의 정보 출력.
		 */
		ResultSet resultSet1 = null;
		PreparedStatement preStat1 = null;
		String sql1 = "SELECT * FROM EMP WHERE EMPNO=145";
		Employer emp1;
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			preStat1 = connection.prepareStatement(sql1);
			resultSet1 = preStat1.executeQuery();
//			emp1 = new Employer(resultSet1.getInt(1), resultSet1.getString(2), resultSet1.getString(3), resultSet1.getDate(4), resultSet1.getInt(5), resultSet1.getInt(6));
//			System.out.println(emp1);
			resultSet1.last();
			System.out.println(resultSet1.getRow());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		/*
		 * 2. 부서코드 20번인 사원의 평균연봉.
		 */
		ResultSet resultSet2 = null;
		PreparedStatement preStat2 = null;
		int deptNo2 = 20;
		String sql2 = "SELECT * FROM EMP WHERE DEPTNO=?";
//		List<Employer> empList2 = new ArrayList<Employer>();
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			preStat2 = connection.prepareStatement(sql2);
			preStat2.setInt(1, deptNo2);
			resultSet2 = preStat2.executeQuery();
			int salTotal = 0;
			int count = 0;
			while(resultSet2.next()) {
				salTotal += resultSet2.getInt("sal");
				count++;
			}
			System.out.println(salTotal/count);
//			while(resultSet2.next()) {
//				empList2.add(new Employer(resultSet2.getInt(1), resultSet2.getString(2), resultSet2.getString(3), resultSet2.getDate(4), resultSet2.getInt(5), resultSet2.getInt(6)));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(Employer emp : empList2) {
//			salTotal += emp.getSal();
//		}
//		System.out.println("20부서의 평균연봉 : " + salTotal/empList2.size());
		
		/*
		 * 3. 개발부의 근무지를 출력.
		 */
		ResultSet resultSet3 = null;
		PreparedStatement preStat3 = null;
		String deptLocal3 = "개발%";
		String sql3 = "SELECT * FROM DEPT WHERE DEPTNAME like ?";
		List<Departure> deptList3 = new ArrayList<Departure>();
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			preStat3 = connection.prepareStatement(sql3);
			preStat3.setString(1, deptLocal3);
			resultSet3 = preStat3.executeQuery();
			while(resultSet3.next()) {
				deptList3.add(new Departure(resultSet3.getInt(1), resultSet3.getString(2), resultSet3.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("개발부서의 근무지들 : ");
		for(Departure dept : deptList3) {
			System.out.println(dept.getDeptName() + " : " + dept.getDeptLocal());
		}
		
		/*
		 * 4. 부서코드가 20인 사원의 이름과 연봉과 부서명을 출력
		 */
		ResultSet resultSet4 = null;
		PreparedStatement preStat4 = null;
		int deptNo4 = 20;
		String sql4 = "SELECT EMP.EMPNAME,EMP.SAL,DEPT.DEPTNAME FROM DEPT,EMP WHERE EMP.DEPTNO=? AND EMP.DEPTNO=DEPT.DEPTNO;";
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			preStat4 = connection.prepareStatement(sql4);
			preStat4.setInt(1, deptNo4);
			resultSet4 = preStat4.executeQuery();
			while (resultSet4.next()) {
				System.out.println("이름 : " + resultSet4.getString(1) + "	연봉 : " + resultSet4.getInt(2) + "	부서 : " + resultSet4.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 5. 2015년에 입사한 사람
		 */
		ResultSet resultSet5 = null;
		PreparedStatement preStat5 = null;
		int hireYear = 2015;
		String sql5 = "SELECT EMP.EMPNAME,EMP.SAL,DEPT.DEPTNAME FROM DEPT,EMP WHERE EMP.DEPTNO=? AND EMP.DEPTNO=DEPT.DEPTNO;";
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			preStat5 = connection.prepareStatement(sql5);
			preStat5.setInt(1, hireYear);
			resultSet5 = preStat5.executeQuery();
			List<Employer> empList5 = new ArrayList<Employer>();
			while (resultSet5.next()) {
				empList5.add(new Employer(resultSet5.getInt(1), resultSet5.getString(2), resultSet5.getString(3), resultSet5.getDate(4), resultSet5.getInt(5), resultSet5.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
