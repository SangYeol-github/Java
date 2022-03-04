package exam10;

import java.util.Scanner;

class FriendController {
	
//	HighFriend[] highFriend;
//	UnivFriend[] univFriend;
//	final private int MAX_HIGH;
//	final private int MAX_UNIV;
//	private int indexOfHigh;
//	private int indexOfUniv;
	Friend[] friend;
	final private int MAX_FRIEND;
	private int indexOfFreind;
	
	FriendController(){
//		MAX_HIGH = MAX_UNIV = 100;
//		indexOfHigh = indexOfUniv = 0;
//		highFriend = new HighFriend[MAX_HIGH];
//		univFriend = new UnivFriend[MAX_UNIV];
		MAX_FRIEND = 300;
		indexOfFreind = 0;
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null, marry = null;
		
		System.out.print("이름을 입력하세요:");
		name = input.nextLine();
		
		System.out.print("전화번호를 입력하세요:");
		phone = input.nextLine();
		
		System.out.print("주소를 입력하세요:");
		address = input.nextLine();
		
		if(choice == 1) {
			System.out.print("결혼 여부를 입력하세요:");
			marry = input.nextLine();
			this.friend[indexOfFreind++] = new MiddleFriend(name, phone, address, marry);
			
		}else if(choice == 2) {
			System.out.print("직업을 입력하세요:");
			work = input.nextLine();
			
			this.friend[indexOfFreind++] = new HighFriend(name, phone, address, work);
			//indexOfHigh++;
			
		} else if(choice == 3) {
			System.out.print("전공을 입력하세요:");
			major = input.nextLine();
			
			this.friend[indexOfFreind++] = new UnivFriend(name, phone, address, major);
			
		}
	}
	
	public void displayFriendInfo() {
		for(int i=0; i < indexOfFreind; i++) {
			friend[i].displayFriendInfo();
			System.out.println();
		}
	}
	
	public void displayBasicFriendInfo() {
		for(int i=0; i< indexOfFreind; i++) {
			friend[i].displayBasicFriendInfo();
			System.out.println();
		}
	}
}



















