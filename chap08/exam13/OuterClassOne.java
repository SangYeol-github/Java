package exam13;

class OuterClassOne {
	//field
	NestedClass nst;
	
	//construct
	OuterClassOne() {
		nst = new NestedClass();
		nst.simpleMethod();
	}
	
	
	//method
	public void whoAreYou() {
		System.out.println("whoAreYou() 호출...");
//		simpleMethod(); 호출 불가능.
		nst.simpleMethod();
	}
	
	
	
	// Nested Class
	static class NestedClass { // new(인스턴스화) 할때 의미를 가짐.
		NestedClass() {
			simpleMethod();
//			 whoAreYou(); 호출 불가능.
			
		}
		
		public void simpleMethod() { //static class 인거지 method도 static은 아님.
			System.out.println("NestedClass = > simpleMethod() 호출...");
		}
		
		
	}
}
