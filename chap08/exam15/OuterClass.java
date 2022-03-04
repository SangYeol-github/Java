package exam15;

interface Readable { //외부에서 내부로 접근 할 수 있게 정의.
	public void read();
}

class OuterClass {
	private String name;

	OuterClass(String name) {
		this.name = name;
	}
	
	public Readable createLocalClassInst(/* final */ int num) { 
//		final 생략가능(int num), 상수화(지워지지 않게 보관) <-만 가능.
//		final method -> Overriding 못함.
//		final class -> 상속 못함.
		class LocalClass implements Readable { //메소드가 호출될때 의미를 가지는 클래스.
//			사용빈도는 높지 않다.
			@Override
			public void read() {
				System.out.println("LocalClass read(): " + name);
				System.out.println("num: " + num);
			}
		}
		
		Readable localClass = new LocalClass(); //다형성
//		localClass.read();
		return localClass; //주소값 가지고 복귀.
	}
	
	
}
