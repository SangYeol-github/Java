package exam02;

public class StringMethod {

	public static void main(String[] args) {
		
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = null;
		
		System.out.println("Smart" + " and " + "Simple");
		System.out.println(str1.concat(str2).concat(str3));
//		concat -> 문자열 결합
//		가급적 사용 최소화. 반복문에서 사용하면 에러 or 종료
//		항상 새롭게 메모리 할당
//		100, 200, 300 -> 400 -> 500 번지.
		
		str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		System.out.println();
		
		//comparTo 차 값을 계산. str1 - str3 (숫자값)
		//문자열이 같은지 다른지 체크하는 용도.
		if(str1.compareTo(str3) < 0) {
			System.out.println("str1 문자열이 str3 문자열보다 사전의 앞에 나온다.");
		} else if(str1.compareTo(str3) == 0){
			System.out.println("str1 문자열이 str3 문자열이 같다.");
		} else {			
			System.out.println("str1 문자열이 str3 문자열보다 사전의 뒤에 나온다.");
		}
		
		
		
	}

}
