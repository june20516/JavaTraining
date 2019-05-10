package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	
	static private Connection conn;
	
	static public Connection getConnection() {
		if (conn == null) {
			new JDBCConnection();
		}
		return conn;
	}

	//	static public final JDBCConnection instance;
	static {
		new JDBCConnection();
	}

	
	private JDBCConnection() {
		try {
			/*
			 * A call to forName("X") causes the class named X to be initialized.
			 */
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","sa");
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static public boolean closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
