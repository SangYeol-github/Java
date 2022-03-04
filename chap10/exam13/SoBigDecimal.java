package exam13;

import java.math.BigDecimal;

public class SoBigDecimal {

	public static void main(String[] args) {
		
		double e1 = 1.6;
		double e2 = 0.1;
		
		System.out.println("두 실수의 덧셈결과 : " + (e1+e2));
		System.out.println("두 실수의 곱셈결과 : " + (e1*e2));
		
		BigDecimal e3 = new BigDecimal("1.6"); // "" 문자열로 표현해야 오차가 없음.
		BigDecimal e4 = new BigDecimal("0.1");
		
		System.out.println("두 실수의 덧셈결과 : " + e3.add(e4));
		System.out.println("두 실수의 곱셈결과 : " + e3.multiply(e4));
		
		
	}

}
