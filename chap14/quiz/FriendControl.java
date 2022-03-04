package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;


class FriendControl {
	
	LinkedList<Friend> list;
	Scanner sc;
	
	FriendControl() {
		
		list = new LinkedList<Friend>();
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
				System.out.println("중복되는 번호 입니다."); continue;
			} else {
				break;
			}
		}
		
		System.out.print("주소를 입력해주세요>> ");
		address = sc.nextLine();
		
		if(num==1) {
			System.out.print("결혼 여부를 입력해주세요>> ");
			marry = sc.nextLine();
			list.add(new Middle(name, number, address, marry));
		} else if(num==2) {
			System.out.print("직업을 입력해주세요>> ");
			job = sc.nextLine();
			list.add(new High(name, number, address, job));
		} else if(num==3) {
			System.out.print("전공을 입력해주세요>> ");
			major = sc.nextLine();
			list.add(new Univ(name, number, address, major));
		}

	}

//	public void showInfo(int num) {
//		if(num==4) {
//			for(Friend e: list) {
//				if(e instanceof Middle) {
//					e.showInfo();
//					System.out.println();
//				}
//			}
//		} else if(num==5) {
//			for(Friend e: list) {
//				if(e instanceof High) {
//					e.showInfo();
//					System.out.println();
//				}
//			}
//		} else if(num==6) {
//			for(Friend e: list) {
//				if(e instanceof Univ) {
//					e.showInfo();
//					System.out.println();
//				}
//			}
//		}
//	}
	public void showInfo(int num) {
		for(Friend e: list) {
			if(num==4) {
				if(e instanceof Middle) {
					e.showInfo();
				}
			} else if(num==5) {
				if(e instanceof High) {
					e.showInfo();
				}
			} else if(num==6) {
				if(e instanceof Univ) {
					e.showInfo();
				}
			}
		}
	}

	public void showAllInfo() {
		for(Friend e: list) {
			e.showInfo();
			System.out.println();
		}
		
	}

	public void showBasicInfo() {
		for(Friend e: list) {
			e.showBaicInfo();
			System.out.println();
		}
		
	}

	public void deleteFriend() {
		System.out.print("삭제할 친구의 번호를 입력해주세요>> ");
		String num = sc.nextLine();
		for(Friend e: list) {
			if(e.getNumber().equals(num)) {
				list.remove(e);
				System.out.println("삭제 완료 했습니다.");
				System.out.println();
				return;
			}
		}
		
	}

	public void searchFriend() {
		System.out.print("찾으시는 친구의 번호를 입력해주세요>> ");
		String num = sc.nextLine();
		for(Friend e: list) {
			if(e.getNumber().equals(num)) {
				e.showInfo();
				System.out.println();
			}
		}
		
	}
	
	public String nameLength() throws NameLength {
		System.out.print("이름을 입력해주세요>> ");
		String name = sc.nextLine();
		if(name.length()<2) {
			NameLength nl = new NameLength();
			throw nl;
		} else {
			return name;
		}
	}
	
	public boolean numberSame(String num) {
		for(Friend e: list) {
			if(e.getNumber().equals(num)) {
				return true;
			} 
		}
		return false;
	}
	
	public void readData() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("Friend.txt"));
			list = (LinkedList<Friend>)in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void writeData() {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("Friend.txt"));
			out.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	

}

class NameLength extends Exception {
	NameLength() {
		System.out.println("이름은 두 글자 이상입니다.");
		System.out.println();
	}
}


