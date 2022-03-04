package exam17;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("덧셈 연산 수행 프로그램.");
		
		System.out.print("첫번째 정수값 입력 : ");
		
		int num1 = keyboard.nextInt();  // int + enter
		
		System.out.print("두번째 정수값 입력 : ");
		
		int num2 = keyboard.nextInt(); // int + enter
		
//		System.out.printf("%d, %d\n", num1, num2);
		
		int sum = num1 + num2;
		System.out.printf("%d + %d = %d\n",num1 , num2, sum);
		
		keyboard.nextLine(); // dummy code( enter )
		
		System.out.println("당신의 이름은?");
		
		String name = keyboard.nextLine();  // 한글입력시 주의!
		
		System.out.printf("당신의 이름은 %s 이군요.\n", name);
	}

}
