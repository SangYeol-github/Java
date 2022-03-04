package exam03;

public class GenericBaseFruitBox {

	public static void main(String[] args) {
		
		Orange orange = new Orange(7);
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		orangeBox.store(orange); //자료형에 안전.
//		orangeBox.store("오렌지"); //orange 만 가능
//		orangeBox.store(apple);
		
		Orange tmpOrange =  orangeBox.pullOut();
		tmpOrange.showSugerContent();
		
	}

}
