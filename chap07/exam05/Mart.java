package exam05;

class Mart {  //참조자료형 - field,construct,method 생략가능
	
	//field(속성) -> 주어진 문제, 기획안을 보고 판단
	private int benefit;  //이윤
	private int numberApple; //잔고(사과 갯수)
	private final int APPLE_PRICE; //사과 단가 -> 한 번 입력되면 변경되지 않음.
						   // 상수형 변수는 모두 대문자로 정의
	
	//construct
	Mart(int bf, int num, int price) {
		this.benefit = bf;
		this.numberApple = num;
		this.APPLE_PRICE = price;
	}
	
	
	//method -기능/동작(사물), 행위(사람) 을 정의 -> field 를 보고 판단
	//사과 판매 행위.
	public int saleApple(int cost) {
		int number = 0;
		
		benefit += cost;
		number = cost/APPLE_PRICE;
		numberApple -= number;
		
		return number;
	}
	
	//정산
	public void showSeller() {
		System.out.println("이윤 : " + benefit);
		System.out.println("사과 재고 : " + numberApple);
	}
	
	
}
