package exam05;

public class AppleMain {

	public static void main(String[] args) {
		
//		Mart e_mart = new Mart(0, 100, 1000);
//		Mart homeplus = new Mart(0, 200, 2000);
//		Mart lotte_mart = new Mart(0, 150, 3000);
//		
//		Buyer mother = new Buyer(100000);
//		Buyer father = new Buyer(50000);
//		Buyer son = new Buyer(10000);
		
		Mart[] mart = new Mart[3];  // null값으로 자동 초기화
//		new Mart()가 100byte 일때
//		new Mart[3](heap), 4byte * 3 = 12byte -> 주소값 
//		mart(참조변수,지역변수,stack) -> 12byte
//		결론 : 주소값 저장하겠다.
		
//		for(int i=0; i<mart.length; i++) {
//			System.out.println(mart[i]);
//		}
//		null 값이 저장되어 있음.
		
		mart[0] = new Mart(0, 100, 1000); //1000번지 주소값을 저장하겠다.
		mart[1] = new Mart(0, 200, 2000); //2000번지 주소값을 저장하겠다.
		mart[2] = new Mart(0, 150, 3000); //3000번지 주소값을 저장하겠다.
		
		
		
//		for(int i=0; i<mart.length; i++) {  //16진수 주소값
//			System.out.println(mart[i]);
//		}
		
		Buyer[] buyer = new Buyer[3];
		buyer[0] = new Buyer(100000);
		buyer[1] = new Buyer(50000);
		buyer[2] = new Buyer(10000);
		
		//어머니가 홈플러스에 가서 사과 4000원 구매.
		buyer[0].buyerApple(4000, mart[1]);
		buyer[0].buyerApple(2000, mart[1]);
		buyer[0].buyerApple(2000, mart[1]);
		
		buyer[0].showBuyer();
		
		mart[1].showSeller();
		
	}

}
