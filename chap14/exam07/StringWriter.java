package exam07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {
		
		try {
//			Writer out = new FileWriter("String.txt");
			 //반드시 대상을 지정
//			BufferedWriter bWriter = new BufferedWriter(out);
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt")); 
//			기존 파일이 존재하면 전부 지우고 다시 써준다.
			
			out.write("더조은 아이티 아카데미");
			out.newLine(); // \n
			out.write("서울시 종로구");
			out.newLine(); // \n			
			out.write("데이터 입력 완료.");
			
			out.close(); //먼저 만드는 습관 들이기.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
