package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 정규표현식 클래스 실습하기 
 * 
 * 정규표현식(Regular Expression)
 *  - 특정규칙을 가진 문자열 집합을 표현하기 위한 형식언어
 *  - 문자열 패턴을 검사하거나 또는 문자열 치환에 많이 사용
 */
public class RegularExpressTest {

	public static void main(String[] args) {
		
		// 정규표현식
		String patt = "b[a-z]*";
		
		boolean r1 = Pattern.matches(patt, "bat");
		boolean r2 = Pattern.matches(patt, "cat");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// 정규표현식 패턴
		String[] patterns = {
							 "[0-9]+",  // 숫자 1개 이상 
							 "0[0-9]*", // 0으로 시작하는 숫자 0개 이상
							 "^[0-9]",  // 숫자로 시작하는 문자 
							 "[^0-9]", 	// 숫자가 아닌 문자
							 ".", 		// 문자 1개 
							 "[a-z]?", 	// 영어 소문자 1개 
							 "[a-z]*",  // 영어 소문자 0개 이상 
							 "[a-z]+",  // 영어 소문자 1개 이상 
							 "[A-Z]*",  // 영어 대문자 0개 이상 
							 "[가-힣]+",	// 한글 1자 이상
							 "\\s",		// 공백
							 "\\S",		// 공백이 아닌 문자
							 "\\d",		// 숫자
							 "\\w",		// 숫자와 문자
							 "\\W"		// 특수문자
							 };
		
		String[] words = {"bat", "010휴대폰", "123456", "011", "hello", "홍길동", 
						  "01", "a", "A", "7", "#"};
		
		for(String word : words) {
			
			System.out.print(word + "문자와 일치하는 패턴 : ");
			
			for(String ptt : patterns) {
				
				boolean result = Pattern.matches(ptt, word);
				
				if(result) {
					System.out.print(ptt + ", ");
				}				
			}
			System.out.print("\n");
		}
		
		// 자주 사용하는 정규표현식
		String ptt1 = "^[a-zA-Z0-9]*$";
		String ptt2 = "^[가-힣]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";
		
		String str = "이름:홍길동, 휴대폰:010-1234-1001, 휴대폰:011-123-1001, 이메일:hong@gmail.com";
		
		Pattern pt1 = Pattern.compile(ptt3);
		Matcher mt1 = pt1.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(mt1.find()) {
			System.out.println(mt1.group());
		}
		
		Pattern pt2 = Pattern.compile(ptt4);
		Matcher mt2 = pt2.matcher(str);
		
		System.out.println("이메일 조회");
		while(mt2.find()) {
			System.out.println(mt2.group());
		}
		
		
	}
}















