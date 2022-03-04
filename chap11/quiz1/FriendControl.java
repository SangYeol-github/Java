package quiz1;

import java.util.Scanner;

class NameLength extends Exception {
	
	NameLength() {
		System.out.println("이름은 두글자 이상입니다.");
		System.out.println();
	}
}

class FriendControl {
	
	Friend[] friend;
	private int index;
	private final int MAX_NUM;
	Scanner sc;
	
	FriendControl() {
		
		MAX_NUM = 300;
		friend = new Friend[MAX_NUM];
		this.index = 0;
		sc = new Scanner(System.in);
	}

	public void addFriend(int num) {
		String name = null, number = null, address = null;
		String marry = null, job = null, major = null;
		
		while(true) {
			try {
				name = nameLength(); break;
			} catch (Exception e) {}
		}
		while(true) {
			System.out.print("번호를 입력해주세요>> ");
			number = sc.nextLine();
				if(numberSame(number)) {
					System.out.println("중복되는 번호입니다."); continue;
				} else {
					break;
				}

		}
		System.out.print("주소를 입력해주세요>> ");
		address = sc.nextLine();
		
		if(num==1) {
			System.out.print("결혼여부를 입력해주세요>> ");
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

	public void deleteFriend() {
		System.out.print("번호를 입력해주세요>> ");
		String number = sc.nextLine();
		for(int i=0; i<index; i++) {	
			if(friend[i].getNumber().equals(number)) {
				for(int j=i; j<index-1; j++) {
					friend[j] = friend[j+1];
				}
			}
		}
//		friend[index-1] = null;
		index--;
		
	}

	public void searchFriend() {
		System.out.print("번호를 입력해주세요>> ");
		String number = sc.nextLine();
		for(int i=0; i<index; i++) {
			if(friend[i].getNumber().equals(number)) {
				friend[i].showInfo();
			} else {
				System.out.println("존재하지 않는 번호입니다.");
			}
		}
		
	}

	public void showAllInfo() {
		for(int i=0; i<index; i++) {
			friend[i].showInfo();
		}
		
	}

	public void showBasicInfo() {
		for(int i=0; i<index; i++) {
			friend[i].showBasicInfo();
		}
		
	}

	public void showInfo(int num) {
		if(num==4) {
			for(int i=0; i<index; i++) {
				if(friend[i] instanceof Middle) {
					Middle middle = (Middle)friend[i];
					middle.showInfo();
				}
			}	
		} else if(num==5) {
			for(int i=0; i<index; i++) {
				if(friend[i] instanceof High) {
					High high = (High)friend[i];
					high.showInfo();
				}
			}
		} else if(num==6) {
			for(int i=0; i<index; i++) {
				if(friend[i] instanceof Univ) {
					Univ univ = (Univ)friend[i];
					univ.showInfo();
				}
			}
		}
	}
	
	public String nameLength() throws NameLength {
		System.out.print("이름을 입력해주세요>> ");
		String name = sc.nextLine();
		if(name.length()<2) {
			NameLength ex = new NameLength();
			throw ex;
		} else {
			return name;			
		}
	}
	
	public boolean numberSame(String number)  {
		
		for(int i=0; i<index; i++) {
			if(friend[i].getNumber().equals(number)) {
				return true;
			} 
		}
		return false;
	}

}
