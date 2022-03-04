package exam04;

class Buyer { //참조자료형
	
	//field
	int myMoney; //가진 돈
	int numOfApple; //사과 갯수
	
	//construct
	Buyer(int money) {
		this.myMoney = money;
		this.numOfApple = 0;
	}
	
	//method(기능)
	// 사과 구매 행위
	public void buyerApple(int money, Mart mart) {
		numOfApple += mart.saleApple(money);
		myMoney -= money;
	}
	
	// 가계부
	public void showBuyer() {
		System.out.println("구매한 사과 갯수 : " + numOfApple);
		System.out.println("남은 돈 : " + myMoney + "원");
	}
}
