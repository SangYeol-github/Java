package exam15;

public class LocalClassTest {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass("First");
		
		Readable localClass = outer.createLocalClassInst(10);
		localClass.read(); //필수적으로 호출방법으로 체크
	}

}
