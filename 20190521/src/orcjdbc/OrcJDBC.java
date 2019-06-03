package orcjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrcJDBC {

	private PreparedStatement pStmt;
	private Connection connection;
	private ResultSet result;

	public OrcJDBC() {
		// DB와 연결
		connection();
		
	}

	private void connection() {
		try {
			Class driver = Class.forName("oracle.jdbc.driver.OracleDriver");
			if (driver != null)
				System.out.println("드라이버 생성 성공");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.44:1521:xe", "lee", "lee");
			if (connection != null)
				System.out.println("커넥션 생성 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getLocalizedMessage();
		} catch (SQLException e) {
			e.getLocalizedMessage();
		}
		if (connection != null) {
			System.out.println("DB연결 성공");
		}
	}


	public void insertUsrData(String id, String pw) {
		String sql = "insert into system.LOGIN values (?,?)";

		try {
			pStmt = connection.prepareStatement(sql);
			pStmt.setString(1, id);
			pStmt.setString(2, pw);
			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet selectUsrData() {
		String sql = "SELECT * FROM system.LOGIN";
		try {
			pStmt = connection.prepareStatement(sql);
			result = pStmt.executeQuery();
			System.out.println("성공");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("실패");
		return result;
	}

	public void closeConn() {
		if (result != null)
			try {
				result.close();
			} catch (Exception e) {
				e.getLocalizedMessage();
			}
		if (pStmt != null)
			try {
				pStmt.close();
			} catch (Exception e) {
				e.getLocalizedMessage();
			}
		if (connection != null)
			try {
				connection.close();
			} catch (Exception e) {
				e.getLocalizedMessage();
			}
	}
	
}
