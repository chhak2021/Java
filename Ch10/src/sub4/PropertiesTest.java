package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김철학
 * 내용 : 프로퍼티 실습하기
 * 
 * 프로퍼티(Properties)
 *  - 문자열 데이터만 취급하는 Key-Value 자료구조
 *  - 프로그램의 환경설정값을 저장할때 사용하는 자료구조
 *  - 입출력 스트림으로 데이터 입출력 
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
	
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 프로퍼티 파일 생성
		String path = "C:\\Users\\java2\\Desktop\\Fruit.properties";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null); // 파일쓰기
			
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로퍼티 파일 생성완료...");
		
		// 프로퍼티 객체 생성
		String target = "C:\\Users\\java2\\Desktop\\Cities.properties";
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis); // 파일읽기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println(propCities.getProperty("kor"));
		System.out.println("프로퍼티 객체 생성완료...");
		
	}
}
