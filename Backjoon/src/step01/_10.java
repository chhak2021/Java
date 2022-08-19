package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김철학
 * 내용 : 백준 1단계 10번 : 킹, 퀸, 룩, 비숍, 나이트, 폰 
 */
public class _10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt() - 1;
		int n2 = sc.nextInt() - 1;
		int n3 = sc.nextInt() - 2;
		int n4 = sc.nextInt() - 2;
		int n5 = sc.nextInt() - 2;
		int n6 = sc.nextInt() - 8;
		
		System.out.print(-n1+" ");
		System.out.print(-n2+" ");
		System.out.print(-n3+" ");
		System.out.print(-n4+" ");
		System.out.print(-n5+" ");
		System.out.print(-n6);
	}
}






















