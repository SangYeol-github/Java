package exam04;

public class ObjectClone {
	
	public static void main(String[] args) {
		
		Point org = new Point(3 , 5);
		Point cpy = null;
		
//		System.out.println(org);
		
		try {
			cpy = (Point)org.clone(); // 복제
			
			org.showPosition();
			cpy.showPosition();
			
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		
	}
}
