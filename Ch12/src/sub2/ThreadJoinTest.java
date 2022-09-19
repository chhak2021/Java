package sub2;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김철학
 * 내용 : 스레드 Join 실습하기
 */
public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
				
		// 스레드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 자식스레드의 작업이 완료된 후 다시 메인스레드로 합류(스레드 대기)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count 값 : " + count.getNum());
	}
}
