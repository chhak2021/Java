package sub3;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김철학
 * 내용 : 필터 스트림 실습하기
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3);
		System.out.println(nums);
		
		// 중복제거
		nums.stream().distinct().forEach(num->System.out.print(num + " "));
		System.out.println();
		
		// 5이상 데이터 필터링(내부 반복자)
		nums.stream().filter(num -> num >= 5).forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		// 5이상 데이터 필터링(외부 반복자)
		for(int num : nums) {
			if(num >= 5) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		// 중복 제거, 짝수 데이터 출력
		nums
		.stream()
		.distinct()
		.filter(num -> num % 2 == 0)
		.forEach(num -> System.out.print(num + " "));
		
	}
}




