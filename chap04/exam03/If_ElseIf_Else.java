package exam03;

public class If_ElseIf_Else {

	public static void main(String[] args) {
		
		int birth = 1992;
		int age = 2022 - birth + 1;
		
		System.out.println("당신의 나이는 " + age + "살 이군요.");
		
		if(age < 10) {
			System.out.println("10대 미만이군요.");
		} else if(age < 20)  { // 10 <= age < 20
			System.out.println("10대군요.");
		} else if(age < 30)  { // 20 <= age < 30
			System.out.println("20대군요.");
		} else {
			System.out.println("30대 이상이군요.");
		}
	
		System.out.println("프로그램 종료.");
		
	}

}
