package exam10;

abstract class Friend { // 공통 특징(부모클래스)
//	미완성이니 abstract class는 인스턴스 생성 불가. 자주 사용하지는 않음.
//	단독으로 사용 못하게, 인스턴스 생성 못하게도 사용.
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	Friend(){}
	
	// Constructor
	Friend(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getName() { return name; }
	
	// Method
	public void displayFriendInfo() {
		System.out.println("이름:" + name);
		System.out.println("폰번호:" + phoneNum);
		System.out.println("주소:" + address);
	}

//	public void displayBasicFriendInfo() {}
	abstract public void displayBasicFriendInfo(); // 추상메서드, abstract method
//	이름만 가지는 메서드.
//	기능구현X, Overriding 목적. -> 미완성의~ 라고 이해하기.
//	추상메서드가 있으면 추상클래스가 있어야되지만
//	추상메서드가 없어도 추상클래스는 정의 가능.

}
















