package exam02;

class StudentScore {  //참조 자료형 -> table, 표 : 많은 데이터 저장
	// Field(필드,멤버변수)
	String name;
	int quiz1, midTerm, quiz2, finalTerm;
	
	//Constructor(생성자)  //new 할때 딱 한번만 호출, 반드시 참조자료형 이름과 같아야된다.
	StudentScore() {
		System.out.println("StudentScore() 호출...");
	}

	// Method (멤버) 메서드
	public int sum() {
		int result = 0;
		result = quiz1 + midTerm + quiz2 + finalTerm;
		return result;
	}
	
	public int average() {
		int result = 0;
		result = (quiz1 + midTerm + quiz2 + finalTerm) / 4;
		return result;
		
	}
}

public class OOP {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		int num; //하나의 값만 저장 가능.
		
		StudentScore hongkildong;
		hongkildong = new StudentScore(); //new: table에 대한 메모리 할당해줘, 주소값 할당
		//hongkildong 주소를 참조해서 참조변수, 무조건 4byte 할당, 주소값을 저장
		
		hongkildong.name = "홍길동";  // .을 붙이면 시작메모리로 간다.(주소)
		hongkildong.quiz1 = 85;       // 데이터 접근방법(저장)
		hongkildong.midTerm = 80;
		hongkildong.quiz2 = 90;
		hongkildong.finalTerm = 95;
		
		System.out.println(hongkildong.name);
		System.out.println(hongkildong.quiz1);
		System.out.println(hongkildong.midTerm);
		System.out.println(hongkildong.quiz2);
		System.out.println(hongkildong.finalTerm);
		
		System.out.println("홍길동의 총점 : " + hongkildong.sum());
		System.out.println("홍길동의 평균 : " + hongkildong.average());
		
		
		StudentScore kangKamChan= new StudentScore(); //Instance화 -> Instance(인스턴스)
		
		kangKamChan.name = "강감찬";
		kangKamChan.quiz1 =75;
		kangKamChan.midTerm = 60;
		kangKamChan.quiz2 = 80;
		kangKamChan.finalTerm = 100;
		
		StudentScore leeSunShin = new StudentScore();
		
		System.out.println("이순신의 총점 : " + leeSunShin.sum());
		
		
		System.out.println("프로그램 종료");
	}

}
