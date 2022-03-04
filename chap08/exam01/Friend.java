package exam01;

class Friend { // 상속-> 공통의 데이터 , 간단한 형식으로 정의하겠다.
	private String name; // 이름
	private String birth; // 생년월일
	private String address; // 주소
	private String email;// 이메일
	
	Friend(String name, String birth, String address, String email) {
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.email = email;
	}
	
	public void displayFrienInfo() {
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birth);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + email);
	}
	
}
