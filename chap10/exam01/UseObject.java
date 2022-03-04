package exam01;

class Person extends Object { //특징 적기.
	private String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() { // 참조자료형(Person)을 쉽게 알려줌.
		return name + "님 환영합니다.";
	}
	
	
}


public class UseObject {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동");
		
		System.out.println(person);
//		System.out.println(person.toString());

	}

}
