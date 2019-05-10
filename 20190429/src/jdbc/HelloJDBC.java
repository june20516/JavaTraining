package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("org.h2.Driver");
			System.out.println("drver is loaded");
			System.out.println("connection complete");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			// stream 설정
			statement = connection.createStatement();
			int age = 20;
			String name = "HHH";
			resultSet = statement.executeQuery("SELECT * FROM SAMPLE where age >= " + age + "AND name = '"+name+"'");
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
