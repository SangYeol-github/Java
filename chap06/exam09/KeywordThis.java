package exam09;

public class KeywordThis {

	public static void main(String[] args) {
		
		Person chulsoo = new Person("철수", 20220209);
//		new 선언시 필드는 기본값으로 초기화 시켜줌.
//		(null,0) , 지역변수는 자동 초기화 안 시켜줌.
		
//		new 4가지 동작 :
//		1.메모리할당 4byte (필드,생성자,메소드)
//		2.this = 시작주소값  (참조변수하고 용도는 같음.)
//		3.생성자 호출 -> this. 내 영역 참조
//		4.return this (주소값 반환)
		
		chulsoo.showInfo();
		
		Person younghee = new Person("영희");
		younghee.showInfo();
		
//		this.showInfo();  this -> Person 안에서만 사용.
//		구분 불가 chulsoo? younghee?
		
		
	}

}
