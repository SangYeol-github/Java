package exam03.has_a;

public class PoliceMain {

	public static void main(String[] args) {
		
		Police police = new Police(2, 2);
		
		police.putHandcuff();
		police.putHandcuff();
		police.putHandcuff();
		police.putHandcuff();
		
		System.out.println();
		
		police.shut();
		police.shut();
		police.shut();
		police.shut();
		

	}

}
