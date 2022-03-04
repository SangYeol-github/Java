package exam02;

public class UseVariableNotation {

	public static void main(String[] args) {
		byte num1, num2; // 변수 선언
		//byte num2;
		
		//num1 = 250; // error 발생
		num1 = 55; // 초기화
		num2 = 15;
		
		System.out.println(num1 - num2);
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); // 55 - 15 = 40
		
		
		int num3 = 512, num4 = 250;
		
		// 00010101 -> 21
		byte num5 = 025; // 8진수
		
		System.out.println(num5);
		
		num5 = 0x15; //16진수
		System.out.println(num5);
		
		//00011110 -> 30
		num5 = 036; //8진수
		System.out.println(num5);
		
		num5 = 0x1e; //16진수
		System.out.println(num5);
		
		
		
		
	}

}
