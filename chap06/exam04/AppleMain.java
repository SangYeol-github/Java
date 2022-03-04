package exam04;

public class AppleMain {

	public static void main(String[] args) {
//		static 빼면 실행 X
//		메모리 할당이 안 됨.
//		new 해야 메모리 할당됨. 미리 할당해야되니
//		static method
		
		Mart e_mart = new Mart(0, 100, 1000);
		
		Buyer mother = new Buyer(100000);
//		Mart e_mart = null;  //new 가 없으면 . 사용(주소값찾기) 안 됨.
//		Buyer mother = null;
		
//		e_mart.saleApple(5000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		
//		e_mart = null;  // 초기화해주면 주소값 연결을 끊음, 소멸
	}

}
