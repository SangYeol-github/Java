package exam08;

public class CastringOperation {

	public static void main(String[] args) {
		
		char alphabet = 'Z';
		int unicode = ' ';
		long num1 = 1000000000000000000L;
		float num2;
		
		num2 = num1; //자동형변환
		
		unicode = (int)alphabet; //명시적형변환
		
		System.out.println(alphabet);
		System.out.println(unicode);
		System.out.println(num2);
		
		byte num3 = 0;
		int num4 = 25;
		
		num3 = (byte)num4;
		System.out.println(num3);
		
		int score = (int)23.5; //강제형변환
		
		System.out.println(score);
		
		int score1 = 0;
		double score2 = 23.5;
		
		score1 = (int)score2; //강제형변환 (score2 값변경X)
		System.out.println(score1);
		
		//float result = 0.5 + 19; //에러
		//float result = 0.5F + 19;
		float result = (float)0.5 + 19;
		System.out.println(result);
	}

}
