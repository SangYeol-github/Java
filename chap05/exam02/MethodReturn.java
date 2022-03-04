package exam02;

public class MethodReturn {

	public static void main(String[] args) {  
		//void 수행하고 아무런 값도 가져가지 않음
		
		int result = multify(10,20); //메소드를 먼저 실행후 값을 가져오고
                                	// 가져오면 값이 사라짐. 변수(result)에 값을 저장
		
		
		if(result >= 100) {
			System.out.println("100 이상 이군요.");
		}
	}
	
	public static int multify (int n1, int n2) { //매개변수
		int result = 0; //지역변수(로컬변수)
		result = n1 * n2;
		System.out.println("곱셈의 값: " + result);
		
		return result; //값을 가지고 복귀할게
	}
}
