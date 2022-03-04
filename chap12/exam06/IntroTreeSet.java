package exam06;

import java.util.TreeSet;

public class IntroTreeSet {

	public static void main(String[] args) {
		
//		HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
//		정렬해서 보관
//		HashSet > TreeSet 퍼포먼스 차이.
		
		// 데이터 저장
		set.add("First");
		set.add("Third");
		set.add("Second");
		set.add("Second");
		set.add("Fourth");
		
		System.out.println(set.size());
		
		for(String e : set) { //알파벳 순서대로 관리
			System.out.println(e);
		}
		
		
	}
}
