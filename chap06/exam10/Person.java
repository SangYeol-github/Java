package exam10;

class Person {
	//field
	private String name; 	//이름
	private int milID;	 	//군번
	private int birthYear;	// 년
	private int birthMonth;	// 월
	private int birthDay;	// 일
	
	
	Person(String name, int milID, int birthYear, int birthMonth, int birthDay) {
		this.name = name;    
		this.milID = milID;	 
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	}						 
							 
	Person(String name, int birthYear, int birthMonth, int birthDay) {
		this(name, 0 , birthYear, birthMonth, birthDay);
//		this() 는 생성자 호출로 사용 가능. 첫번째 생성자 같은 생성자 필요.
		
//		this.name = name;    
//		this.milID = 0;	 
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
	}
	
	Person(String name, int birthYear, int birthMonth) {
		this(name, 0, birthYear, birthMonth, 0);
//		this.name = name;    
//		this.milID = 0;	 
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = 0;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("출생년도 : " + birthYear);
		System.out.println("출생월 : " + birthMonth);
		System.out.println("출생일 : " + birthDay);
		
		if(milID == 0) {
			System.out.println("군번이 없어요.");
		} else {
			System.out.println("군번 : " + milID);			
		}
		
	}
}
