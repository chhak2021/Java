package sub4;

public class SubThread extends Thread {

	@Override
	public void run() {
		
		for(;;) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("보조 스레드 실행...");
		}
	}
}
