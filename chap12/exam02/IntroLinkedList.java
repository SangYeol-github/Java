package exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class IntroLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
//		데이터 저장
		list.add(10); // Auto Boxing
		list.add(20);
		list.add(30);
		list.add(20);
		
//		데이터 참조
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		
//		데이터 삭제
		System.out.println("==============");
		list.remove(1); // 1 = index
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		
		System.out.println();
		
		System.out.println("==============");
		Iterator<Integer> itr = list.iterator();
//		제네릭으로 선언되있는 인터페이스
		
		while(itr.hasNext()) { //전체를 기억.
			System.out.println(itr.next());
		}
		
		System.out.println("==============");
		for(Integer e : list) {
			System.out.println(e);
		} // 직관성이 더 높음.
		
	}

}
