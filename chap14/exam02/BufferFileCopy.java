package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy { //ctrl c + ctrl v

	public static void main(String[] args) {
		
		try {
			byte[] buf = new byte[1024];  //1kbyte = 1024byte = 2의 8승 *2 *2
//			byte[] buf = new byte[2048];  
//			한번에 적재해서 보내기.
			
			int readLen = 0;
			int copyByte = 0;
			
			InputStream in = new FileInputStream("Fonts.zip"); //연결통로.
			OutputStream out = new FileOutputStream("CopyBuffer.zip"); //만들기
			
			while(true) {
				readLen = in.read(buf); //Overoding
				if(readLen == -1) { // -1 다 읽었으면~
					break;
				}
				
				out.write(buf, 0, readLen);
				copyByte += readLen;
			}
			
			in.close(); //연결통로 닫기.
			out.close();
			
			System.out.println("복사된 바이트 크기(버퍼): " + copyByte);
			
		} catch (IOException e) {
			
		}

	}

}
