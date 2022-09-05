package sub2;


public class Calc {
	
	// 싱글톤 객체
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}

	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) throws Exception {
		
		if(y <= 0) {
			// 사용자 예외 강제발생
			Exception e = new Exception("y는 0보다 작거나 같으면 안됩니다.");
			throw e;
		}
		
		return x * y;		
	}

	// 예외가 발생될때 해당 메서드를 호출한 곳으로 예외 던지기
	public int div(int x, int y) throws Exception {
		return x / y;
	}
}
