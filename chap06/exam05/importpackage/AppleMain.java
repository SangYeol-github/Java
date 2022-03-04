package exam05.importpackage;

import exam05.Buyer; // import ctrl+shift+o;

public class AppleMain {  //default, public만 가능

	public static void main(String[] args) {
		
//		Buyer mother = new Buyer(); //-> default class 이므로 호출 불가
//		exam05.Buyer mother = new exam05.Buyer(1000000); 
		//class, construct 모두 public 이어야 온전한 의미를 가진다.
		Buyer mother = new Buyer(100000);
		
	}

}
