package exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferFilterStream {

	public static void main(String[] args) {
		
		try {
			OutputStream out = new FileOutputStream("data.bin");
			BufferedOutputStream bOut = new BufferedOutputStream(out);
			DataOutputStream filterOut = new DataOutputStream(bOut);
			
//			buffer의 효과는 성능향상.
//			연습을 통키로 하기. 기억하기.
//			동영상 mp3 등 순수 데이터 처리.
			
			filterOut.writeInt(365); 
			filterOut.writeDouble(3.14);
			
			filterOut.close(); //연결된 모든것을 close.
			
			InputStream in = new FileInputStream("data.bin");
			BufferedInputStream bIn = new BufferedInputStream(in);
			DataInputStream filterIn = new DataInputStream(bIn);
			
			System.out.println(filterIn.readInt());
			System.out.println(filterIn.readDouble());
			
			filterIn.close();
			
		} catch (IOException e) {
			
		}
	}

}
