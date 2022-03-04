package exam08;

import java.util.Scanner;

class AgeInputException extends Exception { //예외 처리를 위한 참조자료형.
//	catch 탑재.
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ThrowsFromUpperMethod {

	public static void main(String[] args) {
		
		System.out.print("나이를 입력하세요: ");
		
		int age = 0; // 초기화 습관 들이기.
		
		try {
			age = callAge();
		} catch (AgeInputException e) {
			e.printStackTrace();
		}
		System.out.println("당신의 나이는 "+age+"이군요.");

	}
	
	public static int callAge() throws AgeInputException  { //다시 전달
		int age = readAge();
		
		return age;
	}
	
	
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
	
		if (age < 0 /* || age>200 */) {
			AgeInputException excpt = new AgeInputException();
			throw excpt; //던진다. catch문 호출. 예외 발생!
		}
		return age;
	}
}
