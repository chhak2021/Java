package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		
		// 정규표현식
		String patt = "b[a-z]*";
		boolean rs1 = Pattern.matches(patt, "bat");			
		boolean rs2 = Pattern.matches(patt, "cat");		
				
		System.out.println("rs1 = "+rs1);
		System.out.println("rs2 = "+rs2);
		
		// 정규표현식 패턴
		String[] patterns = {".",		// 문자 1개 
							 "[a-z]?", 	// 소문자 1개
							 "[0-9]+", 	// 숫자 1개 이상
							 "0[1-9]*", // 0으로 시작하는 숫자 0개 이상
							 "^[0-9]", 	// 숫자로 시작
							 "[^0-9]",  // 숫자가 아닌 문자
							 "[a-z]*",  // 소문자 0개 이상
							 "[a-z]+",	// 소문자 1개 이상 
							 "\\s",		// 공백
							 "\\S",		// 공백이 아닌 문자
							 "\\d",		// 숫자
							 "\\w",		// 숫자와 문자
							 "\\W"};	// 특수문자
		
		String[] datas = {"bat", "021231234", "12345", "011", 
						  "bed", "02", "A", "7", "a", "#"};
		
		for(String d : datas) {
			System.out.print(d + "문자와 일치하는 패턴 : ");
			for(String p: patterns) {
				boolean result = Pattern.matches(p, d);
				
				if(result) {
					System.out.print(p+", ");
				}
			}
			System.out.print("\n");			
		}
		
		// 자주 사용하는 정규표현식
		String p1 = "^[0-9]*$";
		String p2 = "^[a-zA-Z]*$";
		String p3 = "^[가-힣]*$";
		String p4 = "^[a-zA-Z0-9]*$";	
		String pttHp = "(01\\d{1})-(\\d{4})-(\\d{4})"; // 휴대폰
		String pttEmail = "(\\w+)@(\\w+).(\\w+)"; 	   // 이메일
		
		String source = "휴대폰1:010-1234-1001, 휴대폰1:010-1234-1002, 이메일:chhak@gmail.com";
		
		Pattern ptt1 = Pattern.compile(pttHp);
		Matcher mat1 = ptt1.matcher(source);
		
		System.out.println("휴대폰 조회");
		while (mat1.find()) {
			System.out.println(mat1.group());
		}
		
		Pattern ptt2 = Pattern.compile(pttEmail);
		Matcher mat2 = ptt2.matcher(source);
		
		System.out.println("이메일 조회");
		while (mat2.find()) {
			System.out.println(mat2.group());
		}
		
	}
}
