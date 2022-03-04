package exam03;

public class BuilderString {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Smart");
//		변경해도 바로 사용 가능
//		thread에 안전.
		
//		StringBuilder str = new StringBuilder("Smart");
//		str 참조변수이지만 편의상 인스턴스라고도 부름.
//		StringBuilder 문자열 결합
//		thread에 불안전.
		
//		자체 메모리 안에 넣어줌
//		str.append(" and ");
//		str.append("Simple, ");
//		str.append(true);
//		str.append(25);
//		str.append(3.14);
		str.append(" and ").append("Simple, ").
		append(true).append(25).append(3.14);
		
		System.out.println(str);
		
		str.insert(22, false);
//		0부터 카운팅.
		System.out.println(str);
		
		
	}

}
