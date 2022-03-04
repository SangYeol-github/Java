package exam03.modifier;

import exam03.protect.ParentClass;

class ChildClass extends ParentClass {

	public ChildClass(int n1, int n2, int n3, int n4) {
		super(n1, n2, n3, n4);
	}
	
	public void childMethod() {
//		System.out.println("num1 = " + num1); //접근불가(private)
//		System.out.println("num2 = " + num2); //접근불가(default)
		System.out.println("num3 = " + num3); //접근가능(protected)
		System.out.println("num4 = " + num4); //접근가능(public)
	}
	
	
}


public class FieldInitHeritance {

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass(1, 2, 3, 4);
		
		child.childMethod();
	}

}
