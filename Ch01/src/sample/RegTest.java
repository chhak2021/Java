package sample;

import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		
		String p = "b[a-z]*";
		
		boolean rs1 = Pattern.matches(p, "bat");			
		boolean rs2 = Pattern.matches(p, "cat");		
		
		System.out.println("rs1 = "+rs1);
		System.out.println("rs2 = "+rs2);

		
		
		
		
		
		
		
		// 자주 사용하는 정규표현식
		String p1 = "^[0-9]*$";
		String p2 = "^[a-zA-Z]*$";
		String p3 = "^[가-힣]*$";
		String p4 = "^[a-zA-Z0-9]*$";
		String p5 = "^01\\d{1}-(\\d{4})-(\\d{4})"; // 이메일
		String p6 = "(\\w+)@(\\w+).(\\w+)"; // 이메일
		
		
		
	}
}
