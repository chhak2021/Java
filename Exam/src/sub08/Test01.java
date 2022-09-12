package sub08;
// 문자열 문제
public class Test01 {
	public static void main(String[] args) {
		
		
		
		String result1 = "apple".concat(", orange").concat(", grape");
		System.out.println("result1 : " + result1);
		
		String[] fruits = { "apple", "orange", "grape" };
		
        String result2 = String.join(", ", fruits);
        System.out.println("result2 : " + result2);
        
        
        
        
	}
}
