package quiz;

class Friend {
	
	private String name;
	private String number;
	private String address;
	
	Friend(String name, String number, String address) {
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("주소: " + address);
	}
	
}
