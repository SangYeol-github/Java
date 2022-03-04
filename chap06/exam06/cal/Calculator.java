package exam06.cal;

public class Calculator { //여러 클래스가 정의되면 오직 하나만 public, public 만 관심 가져라.
	Adder adder;  //참조변수 , 주소값 저장. 메모리에 주소값 할당.
	Subtractor subtractor;

	
	public Calculator() {
		
//		Adder adder = new Adder();  construct 에서 변수 선언시 생성자에서만 사용 가능
		adder = new Adder();
		subtractor = new Subtractor();

	}
	
	public int addTwoNumber(int num1, int num2) {
		int result = 0;
		result = adder.addTwoNumber(num1, num2);
		return result;
	}
	
	public int subTwoNumber(int num1, int num2) {
		int result = 0;
		result = subtractor.subTowNumber(num1, num2);
		return result;
	}
	
	public void showOperationTimes() {
		System.out.println("덧셈횟수: " + adder.getCntAdd());
		System.out.println("뺄셈횟수: " + subtractor.getCndSub());
	}

	
}

class Adder {
	private int cntAdd;
	
	Adder() {
		cntAdd = 0;
	}
	
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1 + n2;
	}
	
	int getCntAdd() {
		return cntAdd;
	}
	
}

class Subtractor {
	private int cntSub;
	
	Subtractor() {
		cntSub = 0;
	}
	
	int subTowNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
	
	int getCndSub() {
		return cntSub;
	}
	
	
	
}