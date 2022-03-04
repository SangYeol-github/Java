package exam02;

class ParentClass {
	int num1;
	
	ParentClass(int num) {    //생성자, 필드 선언시
		this.num1 = num;
	}
}

class ChildClass extends ParentClass {

	ChildClass(int num) {   // 자식에서도 만들어줘야됨.
		super(num); // 부모의 필드를 초기화 할 의무를 가짐.
		
	}
	
	
}


public class DefaultSuper {

	public static void main(String[] args) {
		
		new ChildClass(5);

	}

}
