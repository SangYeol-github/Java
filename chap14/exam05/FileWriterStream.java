package exam05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterStream {

	public static void main(String[] args) {
		
//		문자 데이터 처리.
		char ch1 = 'A';
		char ch2 = 'B';
		
		try {
			Writer out = new FileWriter("hyper.txt");
			out.write(ch1);
			out.write(ch2);
			
			out.close();
			
		} catch (IOException e) {}
		
		
	}

}
