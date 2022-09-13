package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


/*
 * 
 * 
 * 내용 : HTTP 통신 실습하기 교재 p521
 */
public class HttpURLTest {

	public static void main(String[] args) {
		
		
		try {
			URL url = new URL("https://google.co.kr");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
			// 출력된 결과 메모장으로 복사후 google.html로 저장해서 브라우저에서 출력해보기
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
