package exam06;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
		Integer iValue = new Integer(10); //Boxing
		Double dValue = new Double(3.14); //Boxing
		
		System.out.println(iValue.intValue()); //UnBoxing
		System.out.println(dValue.doubleValue()); //UnBoxing
		
		
	}

}
