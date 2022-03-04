package exam08;


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Person chulsoo = new Person("철수", 20220209);
		
		chulsoo.showInfo();
		
		Person younghee = new Person("영희");
		
		younghee.showInfo();
	}

}
