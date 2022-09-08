package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 날짜 클래스 실습하기 
 */
public class DateTest {
	public static void main(String[] args) {
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		// Calendar 클래스
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		int y    = cal.get(Calendar.YEAR);		
		int m    = cal.get(Calendar.MONTH) + 1;		
		int d    = cal.get(Calendar.DATE);		
		int hour = cal.get(Calendar.HOUR);		
		int min  = cal.get(Calendar.MINUTE);		
		int sec  = cal.get(Calendar.SECOND);		
		
		System.out.printf("%d-%d-%d %d:%d:%d", y, m, d, hour, min, sec);
	}
}












