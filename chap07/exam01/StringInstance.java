package exam01;

public class StringInstance {

	public static void main(String[] args) {
		
		String hello1 = "안녕하세요!!!";
		// String class 약식
		String hello2 = new String("안녕하세요.");
		//compile 시 변경
		String hello3 = new String("안녕하세요, 여러분~");
		//space 도 포함
		
		System.out.println(hello1);
		System.out.println(hello2);
		
		System.out.println(hello1.length());
		System.out.println(hello2.length());
		System.out.println(hello3.length());
		
//		System.out.println(name1);
//		실행 흐름 때문에
		System.out.println();
		
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		String name3 = "홍길동";
		String name4 = "홍길동";
//		약식을 권고
//		시작 주소값이 같음.
//		name3이 300번지면 name4도 300번지를 불러옴.
//		약식이면 별도의 영역을 자바가 따로 관리한다고 생각
//		단, new 로 만들면 새롭게 번지를 생성
//		메모리 절약 & 높은 퍼포먼스 (많은 문자열 다룰 경우)
		
		System.out.println(name1);  
//		주소값, 참조변수가 문자열이면 문자열을 출력
		
		if(name1 == name2) {
			System.out.println("동일 인스턴스 참조"); //같은 주소값
		} else {
			System.out.println("다른 인스턴스 참조");
		}
		
		if(name3 == name4) {
			System.out.println("동일 인스턴스 참조");
		} else {
			System.out.println("다른 인스턴스 참조");
		}
		
		System.out.println();
		int length = "Hello, Java World!!!".length();
		
		//같음
		String str = "Hello, Java World!!!";
		length = str.length();  // . -> heap 메모리로 가라
		
		System.out.println(length);
		
		
	}

}
