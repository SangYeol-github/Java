package quiz;

import java.util.Scanner;

class NameException extends Exception {
	NameException() {
		System.out.println("한 글자의 이름은 입력하실 수 없습니다.");
	}
}

class FriendControl {
	
	Friend[] friend;
	private int index;
	private final int MAX_NUM;
	Scanner sc;
	
	FriendControl() {
		this.MAX_NUM = 300;
		friend = new Friend[MAX_NUM];
		index = 0;
		sc = new Scanner(System.in);
		
		
	}

	public void addFriend(int num) {
		String name = null, number = null, address = null;
		String marry = null, job = null, major = null;
		while (true) {
		try {
			name = writeName(); break;
		} catch (NameException e) {
//			System.out.println(e.getMessage());
		}
		}
		System.out.print("번호를 입력해주세요>> ");
		number = sc.nextLine();
		System.out.print("주소를 입력해주세요>> ");
		address = sc.nextLine();
		if(num==1) {
			System.out.print("결혼여부>> ");
			marry = sc.nextLine();
			friend[index++] = new Middle(name, number, address, marry);		
		} else if(num==2) {
			System.out.print("직업을 입력해주세요>> ");
			job = sc.nextLine();
			friend[index++] = new High(name, number, address, job);
		} else if(num==3) {
			System.out.print("전공을 입력해주세요>> ");
			major = sc.nextLine();
			friend[index++] = new Univ(name, number, address, major);
		}
		
	}

	public void showFriendInfo() {
		for(int i=0; i<index; i++) {
			friend[i].showInfo();
			System.out.println();
		}	
	}

	public String writeName() throws NameException {
		System.out.print("이름을 입력하세요>> ");
		String name = sc.nextLine();
		if(name.length()<2) {
			NameException ex = new NameException();
			throw ex;
		} else {
			return name;
		}
	}

	public void showFriendBasicInfo(int num) {
		for(int i=0; i<index; i++) {
			
			if(num==4) {
				if(friend[i] instanceof Middle) {
					Middle middle = (Middle)friend[i];
					middle.showInfo();
					System.out.println();
				}
			} else if(num==5) {
				if(friend[i] instanceof High) {
					High high = (High)friend[i];
					high.showInfo();
					System.out.println();
				}
			}
			else if(num==6) {
				if(friend[i] instanceof Univ) {
					Univ univ = (Univ)friend[i];
					univ.showInfo();
					System.out.println();
				}
			}
			
		}
		
	}
}



