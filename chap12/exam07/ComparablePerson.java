package exam07;

import java.util.TreeSet;

class Person implements Comparable<Person> { 
	//TreeSet 은 Comparable 구현
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showData() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	// TreeSet 은 hashCode(), equals() @Override x
	@Override
	public int compareTo(Person o) { //추상메서드
		if(age > o.age) {
			return 1; //양의 정수, 1이상이면 어떤값도 상관없음.
		} else if(age == o.age) {
			return 0;
		} else {
			return -1; //음의정수, 음수이면 됨.						
		}
		
	}
		
}

public class ComparablePerson {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<Person>();

//		Person p1 = new Person("홍길동", 25);
		set.add(new Person("홍길동", 25)); 
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 30));
		set.add(new Person("안중근", 32));
		set.add(new Person("강감찬", 34));
		set.add(new Person("안중근", 32));
		
		for(Person e : set) { 
			e.showData();
		}
		
		

	}

}
