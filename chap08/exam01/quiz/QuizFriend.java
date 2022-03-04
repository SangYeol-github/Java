package exam01.quiz;

class QuizFriend {
	private String name;
	private String phoneNum;
	private String address;
	private int age;
	
	QuizFriend(String name, String phoneNum, String address, int age) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "주소록 [이름=" + name + ", 핸드폰번호=" + phoneNum + ", 주소=" + address + ", 나이=" + age + "]";
	}

}
