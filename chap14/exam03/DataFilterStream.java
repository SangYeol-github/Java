package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStream {

	public static void main(String[] args) {
		
		try {
			OutputStream out = new FileOutputStream("data.bin");
			DataOutputStream filterOut = new DataOutputStream(out);
//			filter 를 하나더 연결.
			
//			out.write(365);
//			out.close();
			filterOut.writeInt(365); // 저장된 순서로 읽기.
			filterOut.writeDouble(3.14);
			
			filterOut.close(); //stream 도 close
			
			InputStream in = new FileInputStream("data.bin");
			DataInputStream filterIn = new DataInputStream(in);
			
			System.out.println(filterIn.readInt());
			System.out.println(filterIn.readDouble());
			filterIn.close();
			
		} catch (IOException e) {
			
		}
		
		
	}

}
