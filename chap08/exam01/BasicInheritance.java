package exam01;

public class BasicInheritance {

	public static void main(String[] args) {
		
		Student student = 
				new Student("이순신", "20010815", "서울시 종로구", "abc@email.com",
						"더조은IT대학", "경영학");
		
		BusinessMan bMan =
				new BusinessMan("홍길동", "19960915", "서울시 서대문구", "def@email.com",
						"더조은IT", "영업부", "20210214");
		
		student.displayStudentInfo();
		System.out.println();
		bMan.displayBusinessManInfo();
		
		System.out.println();
		student.displayFrienInfo();
	}

}
