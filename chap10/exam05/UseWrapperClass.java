package exam05;

class Person {
	
}


public class UseWrapperClass { //기본자료형을 클래스로 감싸자.

	public static void main(String[] args) {
		
		Person person = new Person();
		
		showData(person);
		
		int num = 10;
		
		showData(num);
		
		Integer intInst = new Integer(10);
		
		showData(intInst);

	}
	
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
//	public static void showData(int obj) {
//		
//	}
	
	
}
