package sub2;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 문자열 클래스 String 실습하기
 * 
 * String 클래스
 *  - String 클래스는 문자열을 저장하고 처리에 사용되는 클래스
 *  - 일반적으로 리터럴 방식으로 생성하고 사용
 *  - 문자열 비교 equals 사용 
 */
public class StringTest {
	public static void main(String[] args) {
		
		// 문자열(문자+배열) 생성
		String str1 = "Hello"; // 리터럴(암시적)
		String str2 = new String("Hello"); // 명시적
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1 주소와 str2 주소가 같다.");
		}else {
			System.out.println("str1 주소와 str2 주소가 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 문자열과 str2 문자열이 같다.");
		}else {
			System.out.println("str1 문자열과 str2 문자열이 다르다.");
		}
		
		// 문자열 길이
		String sample = "Hello Korea";
		System.out.println("sample 길이 : "+sample.length());
		
		// 문자열 추출
		System.out.println("sample 1번째 문자 : " + sample.charAt(0));
		System.out.println("sample 7번째 문자 : " + sample.charAt(6));
		
		// 문자열 자르기
		System.out.println("sample 1~6까지 자르기 : " + sample.substring(0, 5));
		System.out.println("sample 7에서 마지막까지 자르기 : " + sample.substring(6));
		
		// 문자열 인덱스
		System.out.println("sample 앞에서 부터 문자 e 인덱스 : " + sample.indexOf("e"));
		System.out.println("sample 뒤에서 부터 문자 e 인덱스 : " + sample.lastIndexOf("e"));
		
		// 문자열 교체
		System.out.println("Hello를 Welcome으로 교체 : " + sample.replace("Hello", "Welcome"));
		System.out.println("Korea를 Busan으로 교체 : " + sample.replace("Korea", "Busan"));
		
		// 문자열 변환
		int  	var1 = 1;
		double 	var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		
	}
}
