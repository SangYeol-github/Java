package exam12;

class ClassPrinter {
	
	// Object obj = pos1;
	public static void print(Object obj) {
		String org = obj.toString();
		
		if(obj instanceof UpperCasePrintable) { //instanceof obj야 upper 알아?
			org = org.toUpperCase(); // org 영문을 전부 다 대문자로 리턴.
		}
		
		System.out.println(org);
	}
}
