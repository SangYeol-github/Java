package exam18;

import java.util.StringTokenizer;

public class TokenizerString02 {

	public static void main(String[] args) {
		
		String phoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("Frist Result ===");
		
		StringTokenizer st1 = new StringTokenizer(phoneNum);
//		default = space, false
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("Second Result ===");
		
		st1 = new StringTokenizer(phoneNum," -");
//		space(여백) & -
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Third Result ===");
		
		st1 = new StringTokenizer(phoneNum," -", true);
//		boolean -> 구분자 출력 여부 지정. dafault값은 false
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}
