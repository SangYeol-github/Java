package quiz;

class Middle extends Friend {
	
	private String marry;
	
	Middle(String name, String number, String address, String marry) {
		super(name, number, address);
		this.marry = marry;
	}
	
	@Override
	public void showInfo() {
		System.out.println("중학교 친구");
		super.showInfo();
		System.out.println("결혼여부: " + marry);
	}
	
	@Override
	public void showBaicInfo() {
		System.out.println("중학교 친구");
		super.showBaicInfo();
		System.out.println("결혼여부: " + marry);
	}

}

class High extends Friend {
	
	private String job;
	
	High(String name, String number, String address, String job) {
		super(name, number, address);
		this.job = job;
	}
	
	@Override
	public void showInfo() {
		System.out.println("고등학교 친구");
		super.showInfo();
		System.out.println("직업: " + job);
	}
	
	@Override
	public void showBaicInfo() {
		System.out.println("고등학교 친구");
		super.showBaicInfo();
		System.out.println("직업: " + job);
	}
	
}

class Univ extends Friend {
	
	private String major;
	
	Univ(String name, String number, String address, String major) {
		super(name, number, address);
		this.major = major;
	}
	
	@Override
	public void showInfo() {
		System.out.println("대학교 친구");
		super.showInfo();
		System.out.println("전공: " + major);
	}
	
	@Override
	public void showBaicInfo() {
		System.out.println("대학교 친구");
		super.showBaicInfo();
		System.out.println("전공: " + major);
	}
	
}
