package exam08;

public class TwoDimenArray {

	public static void main(String[] args) {
		// 2차원 배열(3행 4열)
		int[][] arr = new int[3][4];
//		int arr[][] = new int[3][4];
//		int[] arr[] = new int[3][4];
		
		
//		System.out.println(arr.length);    // 벽만 본다.
//		System.out.println(arr[0].length); // 가서 보면 된다.
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
		
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 7;
		
		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;
		arr[2][3] = 11;
		
		
//		for(int i=0; i<3; i++) {           //행
//			for(int j=0; j<4; j++) {	   //열
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr["+i+"]"+"["+j+"]"+"="+ (arr[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
