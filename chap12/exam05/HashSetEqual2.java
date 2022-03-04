package exam05;

import java.util.HashSet;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		
		return (name+age).hashCode(); 
	} //주체를 알려준다(name+age)

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { //안정적으로 구성
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && (age==tmp.age);
		} else {
			return false;			
		}
	}	
}

public class HashSetEqual2 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<Person>();
		
//		주소값만 비교. 다른데이터로 인식.
//		hashCode() , equals()
		set.add(new Person("홍길동", 25)); //바로 인스턴스화
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 30));
		set.add(new Person("안중근", 32));
		set.add(new Person("강감찬", 32));
		set.add(new Person("안중근", 32));
		
		for(Person e : set) { 
			System.out.println(e);
		}
	}

}
