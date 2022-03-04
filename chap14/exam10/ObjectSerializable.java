package exam10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1, 1, 2.4);
		Circle c2 = new Circle(2, 2, 4.8);
//		c1 주소값. istance.
//		프로그래밍 입장에선 하드디스크로 출력하겠다.
		
		try {
			
			ObjectOutputStream out 
			= new ObjectOutputStream(new FileOutputStream("Object.ser"));
			
			out.writeObject(c1);
			out.writeObject(c2);
			out.writeObject("String implements Serializable");
			
			out.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
