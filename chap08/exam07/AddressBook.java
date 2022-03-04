package exam07;

public class AddressBook {
	/* 
	 * 문제) 고등학교/대학교 친구 주소록 관리 프로그램.
	 *       - 고등학교 친구 : 이름/폰번호/주소/직업.
	 *       - 대학교 친구 : 이름/폰번호/주소/전공.
	 *       
	 *       키보드로부터 입력 받아 저장하고,
	 *       사용자의 요청시 데이터를 출력하는 기능을 구현하세요.
	 */

	public static void main(String[] args) {
		Menu menu = new Menu();
		//FriendController controller = new FriendController();
		
		menu.displayMenu();
		
	}
}

// 실무
// 도큐먼트 유무 묻기. 도큐먼트 먼저 읽기. 시작파일 묻기(main).
// 소스코드 분석보다 실행 먼저. -> 눈에보이는 구조 먼저 파악.
// 구조를 빠르게 파악. 그 기능을 흉내내거나 따라가야됨.
// 하나의 프로젝트는 하나의 일관성이 있어야됨. 동일한 구조로 만들기.
// 프로그래밍? -> 그 사람의 생각을 내가 쫒아가는 과정.