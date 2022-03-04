package exam07;

class A extends Object {
	A() {}
}

class B extends Object {
	public void method() {
		A a = new A();
		
		try {
			a.wait(); // 자바가 제공하는 예외처리 메소드.
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

public class UseException {

	public static void main(String[] args) {
		
		

	}

}
