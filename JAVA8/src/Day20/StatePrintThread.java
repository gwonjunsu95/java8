package Day20;

public class StatePrintThread extends Thread {

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {	//스레드 상태를 0.5초에 한 번씩 출력
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
