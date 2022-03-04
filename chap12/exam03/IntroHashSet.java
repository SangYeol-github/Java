package exam03;

import java.util.HashSet;
import java.util.Iterator;

public class IntroHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
//		데이터 저장
		set.add(10); // Auto Boxing
		set.add(20);
		set.add(30);
		set.add(20);
		
//		데이터 참조
//		for(int i=0; i<set.size(); i++) {
//			System.out.print(set.get(i) +" ");
//		}
//		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
//		제네릭으로 선언되있는 인터페이스
		
		while(itr.hasNext()) { //전체를 기억.
			System.out.println(itr.next());
		}
//		hasNext(), next() 오버라이딩.
		
		
//		데이터 삭제
		System.out.println("==============");
//		set.remove(1); // index가 아니라 object로 인식.
		set.remove(10); // 저장순서를 유지하지 않기때문.
		itr = set.iterator();
//		for(int i=0; i<set.size(); i++) {
//			System.out.print(set.get(i) +" ");
//		}
		
		while(itr.hasNext()) { //전체를 기억.
			System.out.println(itr.next());
		}
		
		System.out.println("==============");
		for(Integer e : set) {
			System.out.println(e);
		} // 직관성이 더 높음.
		
	}

}
