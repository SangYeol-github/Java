package exam06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) {
		
		char[] cbuf = new char[10];
		
		try {
			
			Reader in = new FileReader("hyper.txt");
			int readCnt = in.read(cbuf, 0 , cbuf.length);
			
			for(int i=0; i<readCnt; i++) {
				System.out.println(cbuf[i]);				
			}
			
			in.close(); // usb 안전하게 제거 같은 역활.
//			잊지 않기.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
