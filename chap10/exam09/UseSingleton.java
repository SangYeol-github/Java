package exam09;

class CalendarExam {
	
	private static CalendarExam instance = new CalendarExam();
	
	CalendarExam() {}
	
	public static CalendarExam getInstance() {
		return instance;
	}
}


public class UseSingleton { //하나의 참조변수만 참조하겠다.

	public static void main(String[] args) {
		//Singleton   // new (X)
		CalendarExam calendar1 = CalendarExam.getInstance();
		CalendarExam calendar2 = CalendarExam.getInstance();
		
	}

}
