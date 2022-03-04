package quiz1;

import java.util.Scanner;

class Menu {
	
	FriendControl control;

	Menu() {
		control = new FriendControl();
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" *** 메뉴 선택 *** ");
			System.out.println("0. 프로그램종료.");
			System.out.println("1. 중학교 친구 정보 입력.");
			System.out.println("2. 고교 친구 정보 입력.");
			System.out.println("3. 대학교 친구 정보 입력.");
			System.out.println();
			System.out.println("4. 중학교 친구 정보 출력.");
			System.out.println("5. 고등학교 친구 정보 출력.");
			System.out.println("6. 대학교 친구 정보 출력.");
			System.out.println("7. 중학교/고등학교/대학교 친구 정보 출력.");
			System.out.println("8. 친구 기본 정보 출력.");
			System.out.println();
			System.out.println("9. 데이터 삭제 기능.");
			System.out.println("10. 데이터 검색 기능.");
			
			System.out.print("원하는 메뉴를 선택해주세요>>");
			int num = sc.nextInt();
			switch(num) {
			case 0: System.out.println("프로그램을 종료합니다."); return;
			case 1: case 2: case 3:
				control.addFriend(num); break;
			case 4: case 5: case 6:
				control.showInfo(num); break;
			case 7:
				control.showAllInfo(); break;
			case 8:
				control.showBasicInfo(); break;
			case 9:
				control.deleteFriend(); break;
			case 10:
				control.searchFriend(); break;
			default :
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}
	
	
	
}
