package exam10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadable {

	public static void main(String[] args) {
		
		try {
			
			ObjectInputStream in
			= new ObjectInputStream(new FileInputStream("Object.ser"));
			
			Circle readC1 = (Circle)in.readObject();
			Circle readC2 = (Circle)in.readObject();
			String message = (String)in.readObject();
			
			in.close();
			
			readC1.showCircle();
			readC2.showCircle();
			System.out.println(message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
		}

	}

}
