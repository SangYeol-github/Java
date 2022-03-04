package exam13;

public class NestedClassTest {

	public static void main(String[] args) {
		
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		one.whoAreYou();
//		one.simpleMethod(); //메모리 할당 안 됨.
		one.nst.simpleMethod();
		
		System.out.println();
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		
		nst1.simpleMethod();
		System.out.println();
		
//		new OuterClassTwo.NestedClass(); private 접근 불가.
	}

}
