package exam01;

class Orange {
	int sugerContent; //당분 함량

	Orange(int sugerContent) {
		this.sugerContent = sugerContent;
	}
	
	public void showSugerContent() {
		System.out.println("오렌지 당분 함량: " + sugerContent);
	}
}

class OrangeBox {
	
	Orange item;
	
	OrangeBox() {}
	
	public void store(Orange item) { // 포장
		this.item = item;
	}
	
	public Orange pullOut() { // 개봉
		return item;
	}
}
