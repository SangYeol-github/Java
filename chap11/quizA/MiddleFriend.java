package quizA;

class MiddleFriend extends Friend{
	String married;
	
	MiddleFriend(String name, String phoneNum, String address, String married){
		super(name,phoneNum,address);
		this.married = married;
	}
	
	// Method(멤버메서드)
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("결혼 여부 : " + married);
	}
	
	// 이름, 전공
	public void displayBasicFriendInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("결혼 여부 : " + married);
	}
}

