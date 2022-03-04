package exam07;

public class ArrayAndMethods {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5 }; //new int[] {1, 2, 3, 4, 5 };
		int num = 5;
		int[] ref = null;
		
		ref = addAllArray(arr, num);  // num = 5
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		if(arr==ref) {
			System.out.println("같은 메모리 영역 참조");
		} else {
			System.out.println("다른 메모리 영역 참조");			
		}
		
		for(int i=0; i<ref.length; i++) {
			System.out.print(arr[i] + " ");
		}
			
	}
	
	public static int[] addAllArray(int[] a, int n) {  //int[] a, int n 새롭게 메모리 할당해줘.
		n = 10; //새로운 값 대입.
		
		for(int i=0; i<a.length; i++) {
			a[i] +=10;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		return a;
	}
}
