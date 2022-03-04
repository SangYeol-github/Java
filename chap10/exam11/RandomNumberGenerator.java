package exam11;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num1 = random.nextInt(100) + 1;
		System.out.println("1~100 사이의 임의의 값: " + num1);
		
		double num2 = random.nextDouble(); //*100 -> 100.0 ~ 101.0 사이의 값
		System.out.println("0.0 ~ 1.0 사이의 임의의 실수 값: " + num2);
		
		boolean num3 = random.nextBoolean();
		System.out.println("임의의 논리 값: " + num3);
	}

}
