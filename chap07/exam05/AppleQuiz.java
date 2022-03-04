package exam05;

public class AppleQuiz {

	public static void main(String[] args) {
		
		Mart[] mart = new Mart[2];
		
		mart[0] = new Mart(0 , 100, 1000); 
		mart[1] = new Mart(0 , 50, 2000); 
		 
		Buyer[] people = new Buyer[3];
		people[0] = new Buyer(10000);
		people[1] = new Buyer(30000);
		people[2] = new Buyer(50000);
		
		people[0].buyerApple(5000, mart[0]);
		people[0].buyerApple(2000, mart[1]);
		
		people[1].buyerApple(8000, mart[0]);
		people[1].buyerApple(12000, mart[1]);
		
		people[2].buyerApple(20000, mart[0]);
		people[2].buyerApple(10000, mart[1]);
		
		System.out.println("철수");
		people[0].showBuyer();
		System.out.println("영희");
		people[1].showBuyer();
		System.out.println("미애");
		people[2].showBuyer();
		
		System.out.println("e_mart");
		mart[0].showSeller();
		System.out.println("homeplus");
		mart[1].showSeller();
		
	}

}
