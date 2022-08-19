package sub1;

/*
 * 날짜 : 2022/08/16
 * 이름 : 김철학
 * 내용 : Java 변수 실습하기
 * 
 * 변수(Variable)
 *  - 데이터 처리를 위해 데이터를 저장하는 데이터 그릇
 *  - 변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 *  
 * 상수(Constant)
 *  - 최초 저장된 데이터로 고정되는 변수
 *  - 대문자로 표기
 */
public class VariableTest {
	public static void main(String[] args) {
		
		// 변수
		String hello = "Hello World";
		int a = 3;
		int b = 7;
		
		a = 5;
		
		System.out.println("hello : "+hello);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
				
		// 상수
		final int NUM = 5;
		//NUM = 7;
		
		System.out.println("NUM : "+NUM);		
	}
}
