package quiz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 년도를 입력해주세요>> ");
		int year = sc.nextInt();
		
		boolean leapYear = ((year%4==0 && year%100!=0)|| year%400==0);
		
		if(leapYear) {
			System.out.println(year+"년은 윤년입니다.");
		} else {
			System.out.println(year+"년은 평년입니다.");			
		}
		
	}

}
