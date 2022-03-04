package exam12;

import java.io.File;

public class RelativePath { 
//	window 폴더의 구분 \
//	리눅스,맥 폴더의 구분 /

	public static void main(String[] args) {
		
//		File myFile = new File("c:"+File.separator+"MyJava"+File.separator+"my.bin");
//		window -> \   리눅스, mac -> /
//		절대경로 : 최상위부터 시작.
		
		File myFile = new File("Myjava"+File.separator+"my.bin");
//		상대경로 : 첫 시작점의 인식(파일이 담긴 프로젝트)
		
		if(myFile.exists() == false) { 
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		File reDir = new File("c:"+File.separator+"YourJava"+File.separator+"Java");
		reDir.mkdirs(); 
		
		File reFile = new File(reDir, "my.bin"); 
		myFile.renameTo(reFile); 
		
		System.out.println("프로그램 종료.");

	}

}
