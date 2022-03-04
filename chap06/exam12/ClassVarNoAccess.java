package exam12;

class NoAccessWay { //참조자료형
	//field 맴버변수
	static int num = 0;  //class 변수
	int memVari = 0;
	
	NoAccessWay() {  //construct
		incrementCnt();
//		noAccessWay();
	}
	
	public void incrementCnt() {  //맴버 메서드   // 일반적 원칙
		memVari++; 		// 접근 가능
		num++;	   	    // 접근 가능
		noAccessWay();  //접근가능
	}
	
	public static void noAccessWay() {   
		// 불변일때, 만국 공통의 법칙일때 (ex 원의 넓이)
		//class method

//		memVari++; 		// 접근 불가능    //new 해야 메모리할당 해줘서 안 됨.
		num++;	   		// 접근 가능
//		incrementCnt(); // 접근 불가능
		method();
	}
	
	public static void method() {
		
	}
	
}

public class ClassVarNoAccess {

	public static void main(String[] args) {
		
		NoAccessWay.num = 5;
		NoAccessWay.noAccessWay();
		
		NoAccessWay accessWay = new NoAccessWay();
		
		System.out.println("num : " + accessWay.num);
		
		accessWay.incrementCnt();
		System.out.println("num : " + accessWay.num);
		System.out.println("memvari: " + accessWay.memVari);
		
		accessWay.noAccessWay();
		System.out.println("num : " + accessWay.num);
	}

}
