package exam10;

class UnivFriend extends Friend{ // 대학교 친구(자식클래스)
	
	private String major;// 전공
	
	UnivFriend(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);// 부모 필드(field) 초기화 의무
		this.major = major;
	}
	@Override
	public void displayFriendInfo() {
		System.out.println("대학교 친구");
		super.displayFriendInfo();
		System.out.println("전공:" + major);
		System.out.println();
	}
	
	// Method(기본 기능 출력 - 이름 / 전공)
	public void displayBasicFriendInfo() {
		System.out.println("대학교 친구");
		System.out.println("이름: " + getName());
		System.out.println("전공: " + major);
	}
}	
