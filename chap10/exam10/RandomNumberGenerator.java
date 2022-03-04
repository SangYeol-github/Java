package exam10;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();
//		Random random = new Random(1000);
//		seed 값이 같으면 실행해도 항상 같음.
		
		random.setSeed(System.currentTimeMillis());
//		내부에서 시간의 흐름에 따라 처리.
		
		for(int i=0; i<20; i++) {
			System.out.println(random.nextInt(10));
		}
		
		
	}

}
