package exam11;

import java.io.File;

public class FileMove {

	public static void main(String[] args) {
		
		File myFile = new File("c:\\MyJava\\my.bin");
//		\ 폴더를 구분하는 기호. \\ escape문자
		
		if(myFile.exists() == false) { //파일의 존재유무 체크. 안정화.
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		File reDir = new File("c:\\YourJava\\Java");
		reDir.mkdirs(); // make directory(s) 폴더 생성 기능.
		
		File reFile = new File(reDir, "myMove.bin"); 
		myFile.renameTo(reFile); // 이름변경. 복사의 개념.
		
		System.out.println("프로그램 종료.");
	}

}
