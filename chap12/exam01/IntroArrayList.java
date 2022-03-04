package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroArrayList {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		Integer num1 = 10; /*new Integer(10)*/
//		Integer num2 = 20;
//		Integer num3 = 30;
//		
//		Integer[] num = new Integer[3];
//		num[0] = num1;
//		num[1] = num2;
//		num[2] = num3;
		
//		ArrayList<int> list = new ArrayList<int>(); //wrapper class로 정의.
//		ArrayList<Integer> list = new ArrayList<>(); //8버전 이후 가능.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		데이터(instance - 참조변수) 저장 방법
		
//		list.add(new Integer(10));
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		
//		데이터 참조
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		
		System.out.println();
		
		System.out.println("==============");
		Iterator<Integer> itr = list.iterator();
//		제네릭으로 선언되있는 인터페이스
		
		while(itr.hasNext()) { //전체를 기억.
			System.out.println(itr.next());
		} //전통적 방식.
		
		System.out.println("==============");
		for(Integer e : list) {
			System.out.println(e);
		} // 직관성이 더 높음.
		
		
	}

}
