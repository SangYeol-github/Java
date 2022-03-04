package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; //FileNotFoundException 상속
import java.io.InputStream;
import java.io.OutputStream; //스트림은 단방향성. 입출력 혼용 X

public class ByteFileCopy { // 중심은 프로그램.

	public static void main(String[] args)  {
		
		try {
			int copyByte = 0;
			InputStream in = new FileInputStream("Fonts.zip"); //연결통로.
			OutputStream out = new FileOutputStream("Copy.zip"); //만들기
			
			while(true) {
				int bData = in.read(); // 1byte(모두 데이터)씩 읽고 int 4byte(알려줄 방법)
//				마지막 1바이트에만 값 저장.
				if(bData == -1) { // -1 다 읽었으면~
					break;
				}
				
				out.write(bData);
				copyByte++;
			}
			
			in.close(); //연결통로 닫기.
			out.close();
			
			System.out.println("복사된 바이트 크기: " + copyByte);
			
		} catch (IOException e) {
			
		}
		
		
		
	}

}
