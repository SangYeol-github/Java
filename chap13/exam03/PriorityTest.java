package exam03;

class MessageSendingThread extends Thread {
	
	String message;
	
	MessageSendingThread(String message, int prio) {
		this.message = message;
		setPriority(prio); //thread 안에 정의.
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.printf("%s(%d) \n",message, getPriority());
			
			try {
				sleep(1); // dummy
//			Blocked 상태 지정한 시간만큼. 1000분의 1초
			} catch (InterruptedException e) {}
		}
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		
		MessageSendingThread tr1 = new MessageSendingThread("first", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("second", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("third", Thread.MIN_PRIORITY);
//		MessageSendingThread tr4 = new MessageSendingThread("third", 5);		
//		우선 순위. 10 -> 1 먼저 실행해주겠다.
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		
		
		
	}

}
