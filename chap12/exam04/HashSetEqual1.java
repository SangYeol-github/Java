package exam04;

import java.util.HashSet;

class Num {
	int num;
	
	Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
//		return String.valueOf(num);
		return "" + num;
	}

//		Wrapper class String 은 이미 equals method를 재정의
	@Override
	public boolean equals(Object obj) {
		Num comp = (Num)obj;
		
		if(num == comp.num) {
			return true; //저장하지 않고
		} else {
			return false; //저장한다.			
		}
		
	}

//	set은 hashCode(){해시 알고리즘} 호출 후 equals.
	@Override
	public int hashCode() {
		return num % 3; //3가지로 분류 등등 다양한 처리 가능.
	}

}


public class HashSetEqual1 {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(30));
	
		for(Num e : set) {
			System.out.println(e);
		}
	}

}
