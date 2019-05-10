package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
*사용하는 쿼리
테이블 비우기, 만들기
DROP TABLE IF EXISTS STUDENT;
DROP TABLE IF EXISTS SCORE;
create table student(ID CHAR(20) PRIMARY KEY, NAME CHAR(20), TEL CHAR(30), EMAIL CHAR(255));
create table score(ID CHAR(20) PRIMARY KEY, KOR NUMBER, ENG NUMBER, MATH NUMBER, SCIENCE NUMBER, ADD1 NUMBER, ADD2 NUMBER, ADD3 NUMBER, TOTAL NUMBER, AVG NUMBER, GRADE CHAR(2));

사용할 값 가져오기 
select * from STUDENT, SCORE where student.id = score.id 

현재 테이블 내 데이터 확인
select * from score;
select * from student;

테이블 비우기
delete from score;
delete from student;
 */
public class ExamDBController {

	private PreparedStatement pStmt;
	private Connection connection;
	private ResultSet result;

	public ExamDBController() {
		//DB와 연결
		connection();
		// 테이블이 있으면 지우고, 없으면 만듬.
		createTables();
	}

	private void connection() {
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB연결 성공");
	}

	private void createTables() {
		//실행시점에서 이미 테이블이 있으면 버림
		String dropStudentSql = "DROP TABLE IF EXISTS STUDENT;";
		String dropScoreSql = "DROP TABLE IF EXISTS SCORE;";
		// 학생 정보를 담을 Student 테이블 생성 쿼리
		String createStudentSql = "create table student(ID CHAR(20) PRIMARY KEY, NAME CHAR(20), TEL CHAR(30), EMAIL CHAR(255));"; 
		// 점수 정보를 담을 Score 테이블 생성 쿼리
		String createScoreSql = "create table score(ID CHAR(20) PRIMARY KEY, KOR NUMBER, ENG NUMBER, MATH NUMBER, SCIENCE NUMBER, "
				+ "ADD1 NUMBER, ADD2 NUMBER, ADD3 NUMBER, TOTAL NUMBER, AVG NUMBER, GRADE CHAR(2));";

		try {
			Statement statement = connection.createStatement();
			statement.execute(dropStudentSql+dropScoreSql+createStudentSql+createScoreSql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//STUDENT Table의 Column 구조 : String id, String name, String tel, String email
	public void insertStudentData(String[] personalDataArray) {
		String sql = "insert into STUDENT (id, name, tel, email) values (?,?,?,?)";
		try {
			pStmt = connection.prepareStatement(sql);
			for(int i=0; i < 4; i++) {
			pStmt.setString(i+1, personalDataArray[i]);
			}
			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	// score table의 column 구조
	// String id, int kor, int eng, int math, int science, int add1, int add2, int add3, int total, double avg, String grade
	public void insertScoreData(String id, Integer[] scores, int total, double avg, String grade) {
		// 추가 과목이 덜 입력되었을 때, 과목 수에 맞게 와일드 카드 처리
		int scoreCount = scores.length;
		String scoreWildCards = "";
		// 과목 수 만큼 와일드카드 생성
		for (int i = 0; i < scoreCount; i++) {
			scoreWildCards += "?,";
		}
		// 남은 과목은 0점처리
		while (scoreWildCards.length() < 7 * 2) {
			scoreWildCards +="0,";
		}
		String sql = "insert into SCORE (id, kor, eng, math, science, add1, add2, add3, total, avg, grade) "
				+ "values (?," + scoreWildCards + "?,?,?)";
		try {
			pStmt = connection.prepareStatement(sql);
			pStmt.setString(1, id);
			//점수를 배열로 받아서 와일드카드에 대입
			for(int i = 0; i<scoreCount; i++) {
				pStmt.setInt(i+2, scores[i]);
			}
			//나머지 수치 대입
			pStmt.setInt(2+scoreCount, total);
			pStmt.setDouble(3+scoreCount, avg);
			pStmt.setString(4+scoreCount, grade);

			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return an Array has recently inserted data 
	 * {ID String, NAME String, TEL String, EMAIL String, ID String, KOR Number, ENG Number, 
	 * MATH Number, SCIENCE Number, ADD1 Number, ADD2 Number, ADD3 Number, TOTAL Number, AVG Number, GRADE String}
	 */
	public Object[] selectStudentScoreData() {
		//DB의 result 칼럼 수 = 15
		Object[] rsArray = new Object[15];
		String sql = "select * from STUDENT, SCORE where student.id = score.id ";
		try {
			pStmt = connection.prepareStatement(sql);
			result = pStmt.executeQuery();
			//가장 최근 입력한 데이터 선택
			result.last();
			//값을 다 담을 수 있는 Object 배열로 담아서 리턴 (tableModel에서 row를 추가할 때도 Object[] 형을 )
			for(int idx = 0; idx<rsArray.length; idx++) {
			rsArray[idx] = result.getObject(idx+1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rsArray;
	}
}
