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
//	
//	static JDBCConnection instance;
//	
//	static public JDBCConnection getInstance() {
//		return instance = new JDBCConnection();
//	}
	
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
	
	public int insertEMpInfo() {
		return 1;
	}
	
	
}
