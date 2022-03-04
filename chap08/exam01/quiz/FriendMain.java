package exam01.quiz;

import java.util.Scanner;

public class FriendMain {

	public static void main(String[] args) {
		
		QuizFriend[] friend = new QuizFriend[5];
		
//		friend[0] = 홍길동 010-1234-5678 서울시,종로구 31
//		friend[1] = 이순신 010-2341-8567 서울시,강북구 30
//		friend[2] = 강감찬 010-3412-7856 서울시,강서구 29
//		friend[3] = 유관순 010-4123-8567 서울시,강남구 32
//		friend[4] = 안중근 010-3412-7856 서울시,강동구 28
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<friend.length; i++) {
			System.out.print("입력해주세요: ");
			String a1 = sc.next();
			String a2 = sc.next();
			String a3 = sc.next();
			int a4 = sc.nextInt();
			sc.nextLine();
			friend[i] = new QuizFriend(a1,a2,a3,a4);
		}
		
		for(int i=0; i<friend.length; i++) {
			System.out.println(friend[i].toString());
		}
		

	}

}
