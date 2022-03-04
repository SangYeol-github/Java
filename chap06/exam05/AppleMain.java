package exam05;

public class AppleMain {

	public static void main(String[] args) {
		
		Mart e_mart = new Mart(0, 100, 1000);
		
		Buyer mother = new Buyer(100000);
//		Mart e_mart = null;  //new 가 없으면 . 사용(주소값찾기) 안 됨.
//		Buyer mother = null;
		
//		e_mart.saleApple(5000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		
		
		//System.out.println(e_mart.benefit); private 이므로 직접적 접근 불가.
		System.out.println(mother.myMoney); // default 같은 패키지이므로 접근 허용.
	}

}
