package exam09;

//import java.lang.*; <- 자동 생성

//compile(java,computer가 이해 할수 있는 0,1로 변경) 할때 Object에 상속.
class Person /* extends Object */ { // extends Object 무조건 붙임. 예외없음.
	private String name;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() { //Object에 정의되어 있음.
		
		return name + "님 환영합니다.";
	}
	
}


public class UseObject {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동");
		
		System.out.println(person); //Object method 호출.
//		println(Object x = person);
		
//		addMethod('a');
//		addMethod(5);
	}
	
//	public static void addMethod(char alphabet) {
//		
//	}
//	public static void addMethod(int num) {
//		
//	}

}
