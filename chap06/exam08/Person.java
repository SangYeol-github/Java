package exam08;

class Person {
	//field
	private String name;
	private int milID;
	
	Person(String n, int mID) {
		name = n;    
		milID = mID;
	}
	
	Person(String n) {
		name = n;
		milID = 0;
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
