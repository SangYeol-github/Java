package exam06;

import java.util.Scanner;

class AgeInputException extends Exception { //예외 처리를 위한 참조자료형.
//	catch 탑재.
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
	
}

public class ProgrammerDefineException {

	public static void main(String[] args)  {
		
		System.out.print("나이를 입력하세요: ");
		
		try {
			int age = readAge();
			System.out.println("당신의 나이는 "+ age +"이군요.");
		} catch (AgeInputException e) {
			System.out.println(e.getMessage()); // e.printStackTrace();
		}

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
