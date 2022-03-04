package exam02;

public class FruitBaseFruitBox {

	public static void main(String[] args) {
		
		Apple apple = new Apple(500);
		FruitBox appleBox = new FruitBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = (Apple)appleBox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("-----------------");
		
		Orange orange = new Orange(8);
		FruitBox orangeBox = new FruitBox();
		
		orangeBox.store(orange);
		
		Orange tmpOrange = (Orange)orangeBox.pullOut();
		
		tmpOrange.showSugerContent();
		
		System.out.println("-----------------\n");
		
		orangeBox.store("오렌지"); // String -> Object 상속.
//		범용적 포장지. 자료형에 안전하지 않음.
		
		
	}

}
