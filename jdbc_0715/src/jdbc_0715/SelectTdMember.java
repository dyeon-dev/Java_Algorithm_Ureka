package jdbc_0715;

import java.sql.*;
import java.util.Date;

public class SelectTdMember {

	public static void main(String[] args) {
		//MySQL 연결 테스트
		// MySQL Jdbc Driver 로딩
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//1. JDBC Driver 로딩
		try {
		    Class.forName(driver);
		    System.out.println("로딩 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("로딩 실패 ㅜㅜ");
		    e.printStackTrace();
		}
		//2. MySQL 연결
		// url : JDBC용 URL.  
		// jdbc:mysql://MySQL서버IP:3306/사용DB이름
		String url = "jdbc:mysql://127.0.0.1:3306/world?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "root";
		String password = "1234";
		try {
			Connection conn = DriverManager.getConnection(
					url,
					user,
					password);
			System.out.println("MySQL 연결 성공!!");
			
			Statement stmt = conn.createStatement(); // SQL 전송객체생성 
			String sql = "select * from td_member"; // 실행할 쿼리 
			ResultSet rs = stmt.executeQuery(sql); // select문은 excuteQuery() 사용 
			System.out.println("** Member List **");
			while (rs.next()) {
				int no = rs.getInt("mem_no");
				String name = rs.getString("mem_name");
				String agrade = rs.getString("mem_grade");
				Date regdate = rs.getDate("mem_regdate");
				
				System.out.println(no+","+name+","+agrade+","+regdate);
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println("MySQL 연결 실패 ㅜㅜ");
			e.printStackTrace();
		}
	}
}
