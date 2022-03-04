package exam09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UseCalendar {

	public static void main(String[] args) {
		
		// 현재 날짜
//		Calendar today = new Calendar();
		Calendar today = Calendar.getInstance();
//		Singleton method로 인스턴스 생성 후 접근.
//		완전 Singleton은 아니지만 이렇게 생각해도 됨.
		
		// 년 , 월, 일 구하기
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; // 0부터 시작.
		int day = today.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		// 시, 분 초 구하기
		int hour = today.get(Calendar.HOUR_OF_DAY); // 0~23 // HOUR 1~12
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d시:0%d분:%d초\n", hour, minute, second);
		
		//요일 구하기
//		일 = 1 ~ 토=7
		String[] DAY_OF_WEEK = {"일", "월", "화", "수", "목", "금", "토" };
		int week = today.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("오늘은 " + DAY_OF_WEEK[week]+"요일 입니다.");
		
		// Date
		Date now = new Date();  //java.util
		System.out.println("현재시간 : "+ now.toString());
		
		now = today.getTime(); // Date 타입으로 변경.
		System.out.println("현재시간 : "+ now.toString());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 a E요일");
		String date = sdf.format(now);
		System.out.println(date);
		
		
		//Calendar -> Date(변환)
		Date d1 = new Date(today.getTimeInMillis()); //Date(long date)
		
		//Date -> Calendar(변환)
		Date d2 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}

}
