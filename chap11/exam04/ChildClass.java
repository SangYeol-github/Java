package exam04;

class FatherClass {

	
	@Override
	public String toString() { 
//	 System.out.println(); 했을때 실행
		return "class FatherClass";
	}
	
}


class ChildClass {
	
	@Override
	public String toString() { 

		return "class ChildClass";
	}
}
