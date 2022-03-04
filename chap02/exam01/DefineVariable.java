package exam01;

public class DefineVariable {

	public static void main(String[] args) {
		// 5489 + 9527 = ?
		//System.out.println(5489 + 9527); <- 계산 후 소멸.

		int data1; // (1)메모리 저장 공간 할당 요청.
		int data2;
		int sum;
		//int int; // 예약어 사용 금지
		//int 1data; // 숫자로 시작 할 수 없음.
		int data_1;
		//int data 1; // 공백은 포함X
		int numberNameFreind;
		//data1 = 3.14; // 정수에 실수를 대입
		
		byte number; // -128~127
		
		//number = 150; 범위 초과
		
		
		data1 = 5489; // (2)메모리 접근(데이터 저장)
		data2 = 9527;
		
		System.out.println(data1); //(3) 메모리 접근 방법(데이터 읽어 오기)
		System.out.println(data2);
		
		
		System.out.println("data1 + data2 = " + (data1 + data2));
		System.out.println("data1 - data2 = " + (data1 - data2));
		System.out.println("data1 * data2 = " + (data1 * data2));
		System.out.println("data1 / data2 = " + (data1 / data2));
		
		sum = data1 + data2;
		System.out.println(sum);
		
		System.out.println(sum / 100);
		
		data1 = 1234; // 메모리 재사용
		data2 = 4321;
		
		System.out.println(data1);
		System.out.println(data2);
		
		
		
		
	}

}
