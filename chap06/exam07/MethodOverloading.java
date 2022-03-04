package exam07;

class Adder {
	//field
	//construct
	//method
	public int add(int n1, int n2) { return n1 + n2; } // 메소드 오버로딩 -> 매개변수의 
	public double add(double n1, double n2) { return n1 + n2; } //타입(자료형), 매개변수의
	public double add(int n1, double n2) { return n1 + n2; } // 갯수가 서로 다르면
	public double add(double n1, int n2) { return n1 + n2; } // 동일 이름으로 메서드 정의 가능
	public double add(double n1, int n2, int n3) { return n1 + n2 + n3; } //(조건이 하나 이상)
	
//	public double add(int n1, int n2) { return n1 + n2; } 반환형이 다르다고 오버로딩 되지 않음.
	//호출하는 시점에 (매개변수)구별이 안 됨.
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Adder adder = new Adder();  //메모리할당(인스턴스)
		
		System.out.println("100 + 200 = " + adder.add(100, 200)); //수행되고 난 최종의 값이 출력되는것.
		System.out.println("3.14 + 5.45 = " + adder.add(3.14, 5.45));
		System.out.println("3 + 5.45 = " + adder.add(3, 5.45));
		System.out.println("3.14 + 5 = " + adder.add(3.14, 5));
		System.out.println("3.14 + 5 + 10 = " + adder.add(3.14, 5, 10));
		System.out.println("3 + 5 + 10 = " + adder.add(3, 5, 10));  // int -> double 자동형변환
		

	}

}
