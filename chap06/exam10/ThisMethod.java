package exam10;

public class ThisMethod {

	public static void main(String[] args) {
		
		Person chulsoo = new Person("철수", 20220209, 2000, 9, 5);
		Person younghee = new Person("영희", 2000, 3);
		chulsoo.showInfo();
		System.out.println();
		younghee.showInfo();
	}

}
