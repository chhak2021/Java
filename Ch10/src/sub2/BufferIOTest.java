package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김철학
 * 내용 : 버퍼 입출력 스트림 실습하기
 * 
 * 버퍼 스트림
 *  - 기본 입출력 스트림에 Buffer를 장작해서 빠른 입출력을 지원하는 스트림
 *  - 기본 입출력에 기본적으로 버퍼를 장착
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Java.pdf";
		String target = "C:\\Users\\java2\\Desktop\\Java2.pdf";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림(버퍼) 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					break; // 파일을 모두 읽었을 경우
				}
				
				// 파일 쓰기
				bos.write(data);
			}
			
			// 스트림 해제
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
