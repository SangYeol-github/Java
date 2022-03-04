package exam14;

public class InnerClassTest {

	public static void main(String[] args) {
		
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
//		new OuterClass.InnerClass(); 단독으로 인스턴스 생성 X
		OuterClass.InnerClass inner1 = outer1.new InnerClass(); //인스턴스 생성후 접근해야 가능.
//		class 안에 class 구나 라고 이해하기.
		
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
//		inner1,2 는 outer1에 종속적
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass();
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
//		inner3,4 는 outer2에 종속적
		
	}

}
