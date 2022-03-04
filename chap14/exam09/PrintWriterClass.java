package exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) {
//		System.out 이 PrintStream임을 기억.
//		문자열 출력은 PrintWriter 적극 권고
//		PrintReader X, 출력용만 있음.
		
//		System.out.println(); 모니터 콘솔창으로 출력.
		
		try {
			
			PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
//			출력을 파일로.
			
			out.printf("제 이름은 %s입니다. \n", "홍길동");
			out.println();
			out.print("우리는 자바 입출력을 배우고 있어요.");
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
