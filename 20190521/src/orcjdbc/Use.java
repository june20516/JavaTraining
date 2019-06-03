package orcjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Use { 
	public static void main(String[] args) {
		OrcJDBC test = new OrcJDBC();
		ResultSet result = test.selectUsrData();
//		test.insertUsrData("kwon", "kwon");
		try {

			while(result.next()) {
				System.out.println("ID : " + result.getString(1) + "	PW : " + result.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		test.closeConn();
	}

}
