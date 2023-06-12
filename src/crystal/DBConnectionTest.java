package crystal;

import java.sql.*;


public class DBConnectionTest {
	String url = "jdbc:mysql://localhost:33061/pangmin?serverTimezone=Asia/Seoul\n"
			+ "\n"
			+ "";
	String ID = "lucy";
	String PW = "qorhvkd1514";
	
	DBConnectionTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("로딩 성공");
			Connection conn = DriverManager.getConnection(url, ID, PW);
			System.out.println("서버 연결 성공" + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("로딩 실패");
		} catch (SQLException e) {
			System.out.println("서버 연결 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DBConnectionTest();
	}
			

}
