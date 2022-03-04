package quiz;

import java.util.Scanner;

class Menu {
	
	FriendControl control;
	
	Menu() {
		
		control = new FriendControl();
	}

	public void display() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println(" *** 메뉴 선택 ***");
			System.out.println("0. 프로그램 종료.");
			System.out.println();
			System.out.println("1. 중학교 친구 정보 입력.");
			System.out.println("2. 고등학교 친구 정보 입력.");
			System.out.println("3. 대학교 친구 정보 입력.");
			System.out.println();
			System.out.println("4. 중학교 친구 정보 출력.");
			System.out.println("5. 고등학교 친구 정보 출력.");
			System.out.println("6. 대학교 친구 정보 출력.");
			System.out.println("7. 중학교/고등학교/대학교 친구 정보 출력.");
			System.out.print("번호를 입력해주세요>> ");
			int num = sc.nextInt();
			System.out.println();
			switch(num) {
			case 0: System.out.println("프로그램을 종료합니다."); return;
			case 1: case 2: case 3:
				control.addFriend(num); break;
			case 4: case 5: case 6:
				control.showFriendBasicInfo(num); break;
			case 7:
				control.showFriendInfo(); break;
			default : System.out.println("잘못된 입력입니다."); System.out.println("다시 입력해주세요."); break;
			}
			
		}
		
	}

}
