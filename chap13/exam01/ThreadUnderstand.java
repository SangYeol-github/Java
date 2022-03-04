package exam01;

class SumThread extends Thread { //첫번째 방법.
	
	String threadName;
	int start, end;
	
	SumThread(String name, int start, int end) {
		this.threadName = name;
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	public void run() { // Thread 의 main 역활.
		int sum = 0;
		for(int i=start; i<=end; i++) { //순서가 아닌 적절하게 main thread1 thread2 배분
			sum += i;
			System.out.println(threadName);
		}
		System.out.printf("%s => %d ~ %d까지의 합: %d\n",threadName, start, end, sum);
	}
}

public class ThreadUnderstand {

	public static void main(String[] args) { 
//		main은 반드시 1개만 있어야된다.
//		여러개면 판단이 안됨.
//		java입장에선 thread (main thread)
		SumThread thread1 = new SumThread("쓰레드1",1,100);
		SumThread thread2 = new SumThread("쓰레드2",101,200);
		
		thread1.start(); //Thread 시작할거야 준비하고 있어.
//		바로 복귀함. main은 다음 문장 시작함.
//		또 하나의 main이 실행되고 있다고 생각하면됨.
		thread2.start();
//		3개의 작업을 동시에 실행하는 효과.
//		main threa1(run) thread2(run)
		
		int sum = 0;
		for(int i=1000; i<=1100; i++) { //순서가 아닌 적절하게 main thread1 thread2 배분
			sum += i;
			System.out.println("main");
		}
		System.out.printf("main 메서드 실행 1000~1100지의 합 : %d\n",sum);
		
		System.out.println("프로그램 종료.");
//		컴퓨터 운영체제 상황에 따라서 결과값은 다르게 나옴.
	}

}
