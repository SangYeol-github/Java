package exam02;

class Sum {
	
	int sum;

	Sum() {sum = 0;}
	
	public void addNum(int num) {
		this.sum += num;
	}
	
	public int getNum() {
		return sum;
	}
}

class AddThread extends Sum implements Runnable {
// thread 기능을 가지는건 아님.
	
	int start, end;
	
	AddThread(int s, int e) {
		this.start = s;
		this.end = e;
	}
	
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			addNum(i);
		}
		
	}

}

public class RunnableThread {

	public static void main(String[] args) {
		
		AddThread at1 = new AddThread(1,50);
		AddThread at2 = new AddThread(51,100);
		
		Thread thread1 = new Thread(at1); 
		Thread thread2 = new Thread(at2); 
//		java에서 제공. 두번째 방법.
		
		thread1.start(); 
		thread2.start(); 
		
		try {
			thread1.join(); //Blocked 상태 thread1이 끝났을때.
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합: " + (at1.getNum()+at2.getNum()));

	}

}
