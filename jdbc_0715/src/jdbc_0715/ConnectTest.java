package jdbc_0715;
import java.sql.*;

public class ConnectTest {

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
	
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("MySQL 연결 성공!!");
		} catch (SQLException e) {
			System.out.println("MySQL 연결 실패ㅜㅜ");
			e.printStackTrace();
		}
	}

}
