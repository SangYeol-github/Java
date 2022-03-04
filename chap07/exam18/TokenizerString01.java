package exam18;

import java.util.StringTokenizer;

public class TokenizerString01 {

	public static void main(String[] args) {
		
		String data = "11:22:33:44:55";
		
		StringTokenizer st = new StringTokenizer(data, ":");

//		: -> 구분자 , : 전까지 데이터가 있는지를 확인. 있으면 true.
//		전체로 기억
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
