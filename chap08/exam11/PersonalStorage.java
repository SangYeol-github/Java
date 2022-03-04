package exam11;

//abstract class PersonalStorage { // 거의 없다. 다중 상속 불가능.
interface PersonalStorage { // interface 로 정의. 다중 구현 가능.
//	interface 안에는 추상메서드만 가능.
	public /*abstract */ void addPersonalInfo(String name, String perNum);
	public /*abstract */ String searchName(String perNum);
//	public도 생략 가능.
//	public abstract 자동 추가.
//	인터페이스 간 상속 가능. ex) interface A extends interface B
//	interface 상속 일때 반드시 Overriding 해야되는건 아님.
}
