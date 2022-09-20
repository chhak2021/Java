package sub3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김철학
 * 내용 : 맵 스트림 실습하기
 */
public class MapStreamTest {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("1,2,3", "4,5,6", "7,8,9");
		System.out.println(list);
		
		// flatMap
		list
		.stream()
		.flatMap(str -> Arrays.stream(str.split(",")))
		.forEach(num->System.out.print(num + " "));
		
		System.out.println();
		
		// flatMapToInt
		int result = list
					.stream()
					.flatMapToInt((data)->{
						
						String[] strArr = data.split(",");
						int[] arr = new int[strArr.length];
						
						for(int i=0 ; i<strArr.length ; i++) {
							arr[i] = Integer.parseInt(strArr[i]);
						}
						
						return Arrays.stream(arr);
					})		
					.sum();
		
		System.out.println("result : " + result);
		
	}
}
