package exam01;

public class MethodDef {

	public static void main(String[] args) {
		// 1. 프로그램 시작.
		System.out.println("프로그램 시작.");
		
		// 사용자가 정의한 메서드 호출 방법.
		multiple(5,7);
		gugudan(3);
		// 2. 프로그램의 종료.
		System.out.println("프로그램 종료.");
	}
	
	// 메서드 정의 방법.
	public static void multiple(int n1, int n2) {
		System.out.println("* 1~ 100사이의 (양의)" + n1 +"의 배수이고, " 
				+ n2 + "의 배수를 출력.");
		
		for(int i=1; i<=100; i++) {
			if((i % n1 == 0) && (i % n2 == 0)) {
				System.out.println(i);
			}
		}
	}
	
	// 메서드 정의 방법.
		public static void gugudan(int num) {
			System.out.println("");
			System.out.println("* 구구단" + num + "단 출력");
			for(int i=1; i<=9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
				}
			}
}
