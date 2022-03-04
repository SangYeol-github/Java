package exam01;

public class IfBasic {

	public static void main(String[] args) {
		
		int num1 = 47, num2 = 38; //변수 선언 및 초기화
		int result = 0;
		
		result = (num1 * num1 * num2 * num2) / (num1 - num2);
		
		if(result >= 50000) {
			System.out.println("실행결과 값이 50000 이상입니다. "); //true 일때만
			System.out.println("결과 : " + result);                 //실행
		} 
		
		System.out.println("프로그램 종료...");
		
	}

}
