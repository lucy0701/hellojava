package crystal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class DBConnectionTest {
	
//	public static void main(String[] args) {
//        try {
//            // MySQL 연결 정보 설정
//            String url = "jdbc:mysql://localhost:3306/";
//            String username = "lucy";
//            String password = "Qorhvkd1514@";
//
//            // JDBC 드라이버 로드
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 연결 생성
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            // 쿼리 실행
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM table_name");
//
//            // 결과 출력
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("column_name"));
//            }
//
////            // 연결 종료
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
	
	DBConnectionTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("로딩 성공");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "lucy", "Qorhvkd1514@");
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
