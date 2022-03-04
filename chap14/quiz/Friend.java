package quiz;

import java.io.Serializable;

class Friend implements Serializable {
	
	private String name;
	private String number;
	private String address;
	
	Friend(String name, String number, String address) {
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("주소: " + address);
	}
	
	public void showBaicInfo() {
		System.out.println("이름: " + name);
	}
	
	
}
