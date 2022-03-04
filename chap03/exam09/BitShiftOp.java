package exam09;

public class BitShiftOp { //비트시프트연산자

	public static void main(String[] args) {
		
		byte num = 2; //00000010
		
		System.out.println(num << 1); //곱셈 효과 0000100
		System.out.println(num << 2); //          0001000
		System.out.println(num << 3);
		
		num = 8; //00001000
		System.out.println(num >> 1); //나눗셈 효과 00000100
		System.out.println(num >> 2); //            00000010
		System.out.println(num >> 3);
		
		

	}

}
