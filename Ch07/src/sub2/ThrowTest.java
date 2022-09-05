package sub2;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김철학
 * 내용 : 예외던지기 실습하기
 * 
 * 예외던지기
 *  - 메서드 내부에서 발생하는 예외를 메서드를 호출한 쪽으로 던지기위해 메서드 throws 선언
 *  - 사용자가 생성한 예외를 던지기 위해 throw와 throws 선언
 */
public class ThrowTest {

	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		
		int r3 = 0;
		int r4 = 0;
		
		try {
			// 해당 메서드에서 예외를 던지기 때문에 예외처리
			r3 = cal.multi(2, -2);
			r4= cal.div(2, 0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
	}
}
