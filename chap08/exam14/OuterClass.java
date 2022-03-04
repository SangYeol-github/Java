package exam14;

class OuterClass {
	private String name;
	private int num;
	
	
	OuterClass(String name) {
		this.name = name;
		this.num = 0;
		new InnerClass();
	}
	
	public void whoAreYou() {
		num++;
		System.out.println(name + " OuterClass " + num);
	}
	
	class InnerClass { //종속적인 경우에 정의. 외부클래스가 의미를 가져야
					   //내부 클래스도 의미를 가짐.
		InnerClass() {
			whoAreYou(); // 호출할때 whoAreYou 는 메모리 할당되 있어서 가능.
		}
		
	}
	
	
}
