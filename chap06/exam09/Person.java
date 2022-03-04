package exam09;

class Person {
	//field
	private String name;
	private int milID;
	
	Person(String name, int milID) {
		this.name = name;    //this 객체 자신.
		this.milID = milID;  //name = name 하면 가까이에
	}						 //있는걸로 사용
							 
	Person(String name) {
		this.name = name;
		this.milID = 0;      //this.milID 가독성
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		
		if(milID == 0) {
			System.out.println("군번이 없어요.");
		} else {
			System.out.println("군번 : " + milID);			
		}
	}
}
