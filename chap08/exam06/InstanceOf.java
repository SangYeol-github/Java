package exam06;

class Box {
	public void simpleWrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox { 
	public void goldWrap() {
		System.out.println("gold wrap");
	}
}


public class InstanceOf {
	
	public static void wrapBox(Box box) {  //자료형 타입을 체크하는 연산자.
		if(box instanceof GoldPaperBox) { // 상속의 조건하에서 가능. 순서 중요.
			((GoldPaperBox)box).goldWrap();
		} else if(box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}
	
	public static void main(String[] args) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	
	// Box box = box1; // Box box = box2; // Box box = box3;
//	public static void wrapBox(Box box) { 
//		box.simpleWrap();
//		box.paperWrap(); // 불가능.
//	}
//	public static void wrapBox(PaperBox box) { //PaperBox box = box2;
//		box.simpleWrap();						// Box box = box2;
//		box.paperWrap();
//	}
//	public static void wrapBox(GoldPaperBox box) { //GoldPaperBox box = box3;
//		box.simpleWrap();							//Box box = box3;
//		box.paperWrap();
//		box.goldWrap();
//	}

}
