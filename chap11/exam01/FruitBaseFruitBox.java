package exam01;

public class FruitBaseFruitBox {

	public static void main(String[] args) {
		
		Apple apple = new Apple(500);
		AppleBox appleBox = new AppleBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = appleBox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("-----------------");
		
		Orange orange = new Orange(8);
		OrangeBox orangeBox = new OrangeBox();
		
		orangeBox.store(orange);
		
		Orange tmpOrange = orangeBox.pullOut();
		
		tmpOrange.showSugerContent();
		
		System.out.println("-----------------\n");
		
//		orangeBox.store("오렌지"); // Orange만 가능.
//		자료형에 안전. 개별포장지 필요.
	}

}
