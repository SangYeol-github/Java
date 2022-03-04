package exam08;

class MiddleFriend extends Friend {
	
	private String marry;

	MiddleFriend(String name, String phoneNum, String address, String marry) {
		super(name, phoneNum, address);
		this.marry = marry;
	}
	
	@Override
	public void displayFriendInfo() {
		System.out.println("중학교 친구");
		super.displayFriendInfo();
		System.out.println("결혼여부:" + marry);
		System.out.println();
	}
}
