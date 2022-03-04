package exam11;

class InstCnt { //참조자료형  // 객체 = 인스턴스  
//	 int instNum;           // 1 1 1
	 static int instNum;	// 1 2 3
	 // main의 InstCnt 보면 무조건 들어와서 
	 //static(필드,메서드) 을 찾고 최초 1번 메모리를 할당
	 //동작되도록 약속된 키워드. new에선 메모리 할당x
	 // 같은 이름이면 접근 가능.
	 // 접근 방법 동일.
	 //인스턴스가 공유해야되는 데이터가 있을때 사용.
	 // static -> 공유의 개념의 데이터
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}

public class ClassVariable {

	public static void main(String[] args) {
		
//		new InstCnt();    // 100번지 후 소멸
//		new InstCnt();    // 200번지 후 소멸
//		new InstCnt();	  // 300번지 후 소멸
		
		InstCnt.instNum = 10; // static 은 참조변수 없이 사용 가능.
		//참조자료형. 으로 부를수 있음
		// static 변수 = 클래스 변수
		InstCnt.instNum++;
		System.out.println(InstCnt.instNum);
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System.out.println(cnt1.instNum);
		System.out.println(cnt2.instNum);
		System.out.println(cnt3.instNum);
		
	}

}
