package exam06;

public class InstanceArray {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		
//		strArr[0] = new String("홍길동");
//		약식
		strArr[0] = ("홍길동");
		strArr[1] = ("이순신");
		strArr[2] = ("세종대왕");
//		strArr[2] = 10;   <- 동일한 자료형만 가능
//		strArr[3] = ("안중근");
//		컴파일 과정에서는 에러를 내주지는 않는다. 실행시 에러.
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}

	}

}
