package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * prepared statement를 사용하는 방법
 */
public class HelloJDBC2 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement pStat;
		try {
			Class.forName("org.h2.Driver");
			System.out.println("drver is loaded");
			System.out.println("connection complete");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			// stream 설정
			String sql1 = "SELECT id,name,age FROM SAMPLE where age >= ? AND name = ?";
//			statement = connection.createStatement();
			pStat = connection.prepareStatement(sql1);
			int age = 20;
			String name = "HHH";
//			resultSet = statement.executeQuery("SELECT * FROM SAMPLE where age >= " + age + "AND name = '"+name+"'");
			pStat.setInt(1, age);
			pStat.setString(2, name);
			resultSet = pStat.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " , " + resultSet.getString("name")+ " , " + resultSet.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
