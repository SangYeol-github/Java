package exam11;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int e: arr) {
			System.out.println("e = " + e);
			sum += e;
		}
		System.out.println("배열 요소의 합 : " + sum);
		
		System.out.println();
		
		for(int e: arr) {
			e++;
			System.out.print(e+ " ");
		}
		
		System.out.println();
		
		for(int e: arr) { // 변경 X
			System.out.print(e+ " ");
		}
		
		
		
	}

}
