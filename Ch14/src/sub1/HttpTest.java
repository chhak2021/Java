package sub1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 날짜 : 2022/09/21
 * 이름 : 김철학
 * 내용 : HTTP 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://google.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				System.out.println(line);
			}
			
			br.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
}
