package sub3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김철학
 * 내용 : 직렬화 실습하기
 * 
 * 객체의 직렬화
 *  - 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 *  - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 */
public class SerializeTest {
	
	public static void main(String[] args) {
		
		// 직렬화 객체 생성
		Apple apple = new Apple("한국", 2000);
		
		String path = "C:\\Users\\java2\\Desktop\\Apple.dat";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 내보내기
			oos.writeObject(apple);
			
			// 스트림 해제
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("직렬화 완료...");
	}
	
}
