package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2022/09/15
 * 이름 : 김철학
 * 내용 : JDBC PreparedStatement 실습하기
 */
public class PreparedTest {
	
	public static void main(String[] args) {
	
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
				
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1022-1001");
			psmt.setInt(4, 27);
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			// 6단계
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
	}
}
