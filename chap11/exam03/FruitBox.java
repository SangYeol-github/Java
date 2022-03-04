package exam03;

class FruitBox<T> { //제네릭 클래스 <T> 대입 문자
	
	T item;
	
	FruitBox() {}
	
	public void store(T item) { // 포장
		this.item = item;
	}
	
	public T pullOut() { // 개봉
		return item;
	}
}
