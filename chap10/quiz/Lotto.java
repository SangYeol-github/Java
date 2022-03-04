package quiz;

import java.util.Random;
import java.util.Scanner;

class UnerMoney extends Exception {
	UnerMoney(){
		System.out.println("1장당 금액은 1000원 이상입니다.");
		System.out.println();
	}
}

public class Lotto {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] += i + 1;
		}
		
		int won = 0;
		while(true) {
		System.out.println();
		System.out.println("0. 종료");
		System.out.println("1. 자동");
		System.out.println("2. 수동");
		System.out.print("구입방법을 선택해주세요>> ");
		int choice = sc.nextInt();
		System.out.println();
		if(choice == 0) return;
		
		if(choice == 1) {
			while(true) {
				try {
					won = underMoney(); break;
				} catch (Exception e) {}
			}
			for(int j=0; j<won/1000; j++) {
				System.out.printf("%3dGame: ", j+1);
				
				for(int i=0; i<10000; i++) {
					int r = random.nextInt(44) +1;
					int temp = lotto[0];
					lotto[0] = lotto[r];
					lotto[r] = temp;
				}
				for(int i=0; i<6; i++) {
					System.out.printf("%2d ",lotto[i]);
				}
//				System.out.println("보너스: " + lotto[6]); 
				System.out.println();
			}
		} else if(choice==2) {
			while(true) {
				try {
					won = underMoney(); break;
				} catch (Exception e) {}
			}
			int[] choiceNum = new int[6];
			for(int i=0; i<won/1000; i++) {
				System.out.println("번호 6자리 입력해주세요.");
				for(int j=0; j<6; j++) {
					choiceNum[j] = sc.nextInt();					
				}
				System.out.println();
			}
			for(int i=0; i<won/1000; i++) {
				System.out.print("감사합니다.\n" + (i+1)+ "번째 게임번호 :");
				for(int j=0; j<6; j++) {
					System.out.print(choiceNum[j] + " ");
				}
				System.out.println();
			}
			
			
		} else {
			System.out.println("잘못된 입력입니다.");
			System.out.println("다시 입력해주세요.");
			
		}
	}
	}
	public static int underMoney() throws UnerMoney {
		System.out.println("얼마를 구매 하시겠습니까?(최대한도 1인당 100,000원)");
		System.out.print("구매금액: ");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		if(won<1000) {
			UnerMoney under = new UnerMoney();
			throw under; 
		} else {
			return won;			
		}
	}
	
	
}

