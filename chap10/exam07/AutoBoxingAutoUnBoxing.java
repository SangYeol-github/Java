package exam07;

public class AutoBoxingAutoUnBoxing {

	public static void main(String[] args) {
		
//		String name = "홍길동"; //new String("홍길동");
//		int num = 10;
		
		Integer iValue = 10; // Auto Boxing
		Double dValue = 3.14; //Auto Boxing
		
		System.out.println(iValue); // Auto UnBoxing
		System.out.println(dValue); // Auto UnBoxing
		
		iValue = iValue + 10;
		
		System.out.println(iValue);
	}

}
