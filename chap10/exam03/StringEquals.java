package exam03;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1 = new String("Hi my String");
		String str2 = new String("Hi my String");
		
		if(str1==str2) {
			System.out.println("인스턴스 값 일치");
		} else {
			System.out.println("인스턴스 값 불일치");
		}
		
		if(str1.equals(str2)) { //String class equals 는 문자열 비교.
//			이미 Overriding 되어있음.
			System.out.println("문자열의 내용 동일");
		} else {
			System.out.println("문자열의 내용 동일하지 않음.");
		}
		
		
	}

}
