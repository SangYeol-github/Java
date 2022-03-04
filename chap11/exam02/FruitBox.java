package exam02;

class Apple {
	
	int weight; // 사과의 중량

	Apple(int weight) {
		this.weight = weight;
	}
	
	public void showAppleWeight() {
		System.out.println("사과의 중량: " + weight);
	}
}

class Orange {
	int sugerContent; //당분 함량

	Orange(int sugerContent) {
		this.sugerContent = sugerContent;
	}
	
	public void showSugerContent() {
		System.out.println("오렌지 당분 함량: " + sugerContent);
	}
}

class FruitBox {
	
	Object item;
	
	FruitBox() {}
	
	public void store(Object item) { // 포장
		this.item = item;
	}
	
	public Object pullOut() { // 개봉
		return item;
	}
}
