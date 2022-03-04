package exam05;

public class SCE2 { //Short-Circuit Evaluation

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		result = (num1 +=10) < 0 & (num2 += 10) > 0;
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2); 
		//&&은 앞을 판단하고 false면 뒤는 계산하지 않음.
		
		System.out.println();
		
		result = (num1 +=10) > 0 | (num2 +=10) > 0;
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2); 
		//|| 도 앞을 판단하고 바로 연산. &,|는 모두 판단 후 계산.
		
		
	}

}
