package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김철학
 * 내용 : JDBC 실습하기
 * 
 * JDBC(Java DataBase Connectivity)
 *  - 자바에서 데이터베이스 연결을 위한 기술표준
 *  - Java는 기본적으로 JDBC 라이브러리 포함하고 해당 DBMS에 맞는 드라이버만 다운로드&설정
 */
public class JDBCTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터베이스 접속 테스트 완료...");
		
	}
}
