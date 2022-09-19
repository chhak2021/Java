package sub1;

public class SubThread extends Thread {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i=0 ; i<20 ; i++) {
			
			try {
				// 스레드 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " 스레드 실행...");			
		}
		
		System.out.println(name + " 스레드 종료...");
	}
}
