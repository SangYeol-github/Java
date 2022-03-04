package exam13;

public class OuterClassTwo {
	NestedClass nst;
	
	OuterClassTwo() {
		nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass {
		public void simpleMethod() {
			System.out.println("private NestedClass => simpleMethod() 호출...");
		}
	}
	
	
}
