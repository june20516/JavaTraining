package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SampleConnection {
	public static void main(String[] args) {
		Connection connection = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		PreparedStatement pStat1 = null;
		PreparedStatement pStat2 = null;
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			// stream 설정
			String nameCap = "j";
			String sql1 = "SELECT * FROM SAMPLE WHERE name like ?'%'";
			// j 로 시작하는 데이터 
			pStat1 = connection.prepareStatement(sql1);
			pStat1.setString(1, nameCap);
			resultSet = pStat1.executeQuery();
			List<Sample> sampleList = new ArrayList<Sample>();
			while (resultSet.next()) {
				sampleList.add(new Sample(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3)));
			}
			System.out.println("j 로 시작하는 데이터 ");
			for(Sample sample: sampleList) {
				System.out.println(sample.getName()+" " + sample.getAge());
			}
			
			// 60세 이하인 사람의 데이터
			System.out.println("60세 이하인 사람의 데이터");
			int age = 60;
			String sql2 = "SELECT * FROM SAMPLE WHERE age <= ?";
			pStat2 = connection.prepareStatement(sql2);
			pStat2.setInt(1, age);
			resultSet2 = pStat2.executeQuery();
			List<Sample> sampleList2 = new ArrayList<Sample>();
			while (resultSet2.next()) {
				sampleList2.add(new Sample(resultSet2.getInt(1),resultSet2.getString(2),resultSet2.getInt(3)));
			}
			for(Sample sample: sampleList2) {
				System.out.println(sample.getName()+" " + sample.getAge());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (resultSet2 != null)
					resultSet2.close();
				if (pStat1 != null)
					pStat1.close();
				if (pStat2 != null)
					pStat2.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
