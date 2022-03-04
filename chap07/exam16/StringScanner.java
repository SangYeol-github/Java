package exam16;

import java.util.Scanner;
//import java.lang.System;
//import java.lang.String;
//import java.lang.*; 전부다 안에 포함시킨다. 단점:파일 사이즈가 커짐.
//		java.lang 은 많이 사용되어지는 특징들의 참조자료형 선언
//		ex) String 필수적으로 사용, 컴파일시 자동으로 import 추가 해줌.

public class StringScanner {

	public static void main(String[] args) {
		
		String source = "1 5 7";
		Scanner scanner = new Scanner(source);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1 + num2 + num3;
		
		System.out.printf("문자열에 저장된 num1 = %d, num2 = %d,"
				+ " num3 = %d, sum = %d \n",num1, num2, num3, sum);
		
		
	}
}
