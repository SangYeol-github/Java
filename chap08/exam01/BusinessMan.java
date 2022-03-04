package exam01;

class BusinessMan extends Friend { //회사원 친구
	private String company; //회사
	private String department; //소속 부서
	private String businessNum; //사번
	
	BusinessMan(String name, String birth, String address, String email, String company, String department,
			String businessNum) {
		super(name, birth, address, email); //직접 호출X 우회적 호출.
		this.company = company;
		this.department = department;
		this.businessNum = businessNum;
	}
	
	public void displayBusinessManInfo() {
		displayFrienInfo();
		System.out.println("회사: " + company);
		System.out.println("소속부서: " + department);
		System.out.println("사번: " + businessNum);
		
	}
	
}
