package jdbc_0715;
import java.sql.*;

public class InsertTodoTest {

	public static void main(String[] args) {
		// MySQL 연결테스트 
		// MySQL Jdbc Driver 로딩 
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//1. JDBC Driver 로딩
		try {
		    Class.forName(driver);
		   System.out.println("로딩성공");
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		
		// 2. MqSQL 연결 
		// url: JDBC용 url 
		String url = "jdbc:mysql://127.0.0.1:3306/world?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "root";
		String password = "1234";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("MySQL 연결 성공!!");
			stmt = conn.createStatement(); // SQL 보내고 결과 수신하는 객체 생성 
			String sql = "insert into todo\n"
					+ "(td_mno, td_title, td_content, td_regdate, td_upddate)\n"
					+ "values\n"
					+ "(105, '5번제목','5번내용',now(), now());";
			stmt.executeUpdate(sql); // insert, update, delete
			System.out.println("할일 등록 성공!!");
			
			} catch (SQLException e) {
			System.out.println("MySQL 연결 실패ㅜㅜ");
			e.printStackTrace();
		}
	}

}
