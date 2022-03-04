package exam05;

public class IntroGenericArray {

	public static void main(String[] args) {
		
		String[] stArr = {"Hi", "I'm so happy", "Java Generic Programming"};
		
		showArrayData(stArr);
		
	}
	
	public static <T> void showArrayData(T[] arr) { 
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(T e : arr) {
			System.out.println(e);
		}
	}

}

class Fruit {
	
}
class Apple extends Fruit {
	
}
class Apple1 extends Fruit {
	
}
// <? extends Apple> Apple Apple1
// <? super Apple> Object Fruit Apple
// 제네릭 : Object를 상속하는 참조자료형만 가능 -> <T>


