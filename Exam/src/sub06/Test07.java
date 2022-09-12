package sub06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;		
		
		System.out.print("첫번째 수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수 : ");
		b = Integer. parseInt(br.readLine());
		
		System.out.print("세번째 수 : ");
		c = Integer. parseInt(br.readLine());

        System.out.printf("가장 큰 수는 %d입니다.", larger(larger(a, b), c));
	}
	
	public static int larger(int a, int b) {
        return (a >= b) ? a : b;
    }
}
