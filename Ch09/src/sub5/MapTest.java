package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김철학
 * 내용 : 자료구조 Map 실습하기
 * 
 * Map
 *  - 키-값(Key-Value) 쌍으로 이루어진 자료구조
 *  - Map을 구현한 HashMap을 많이 사용하고 키를 이용해서 List보다 빠른 탐색 수행
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<>();
		
		// Map 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// Map 크기
		System.out.println("map 크기 : " + map.size());
		
		// Map 출력
		System.out.println("map A값 : " + map.get('A'));
		System.out.println("map B값 : " + map.get('B'));
		System.out.println("map C값 : " + map.get('C'));
		
		// Map 반복문
		for(char k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		// List-Map 응용
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("홍콩", 1000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		// 한국사과
		Map<Integer, Apple> appleMap = mapList.get(0);
		Apple apple = appleMap.get(101);
		apple.show();
		
		// 호주사과
		mapList.get(1).get(203).show();
		
		// 태국사과
		mapList.get(2).get(302).show();
	}
}
