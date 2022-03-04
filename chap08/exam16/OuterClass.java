package exam16;

interface Readable { //인스턴스 생성 금지.
	public void read(); //추상메서드 재정의 해줘야되는 의무.
}

class OuterClass {
	private String name;

	OuterClass(String name) {
		this.name = name;
	}
	
	public Readable createLocalClassInst(/* final */ int num) { 
		
		return new Readable() { 
//		안에서만 사용하므로 익명클래스를 사용.
//		자바 개발자들이 아주 많이 활용.

			@Override
			public void read() {
				System.out.println("LocalClass read(): " + name);
				System.out.println("num: " + num);
			}
		};
	}
	
	
}
