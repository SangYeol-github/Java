package exam03.has_a;

class Police {
	int handcuffs;
	Gun pistol;
	
	Police(int handcuffs, int bcum) {
		this.handcuffs = handcuffs;
		if(bcum>0) {
			pistol = new Gun(bcum);
		} else {
			pistol = null;
		}
	}
	
	public void putHandcuff() {
		if(handcuffs <= 0) {
			System.out.println("OMG");
		} else {
			System.out.println("SNAP!");			
		}
		handcuffs--;
	}
	public void shut() {
		if(pistol == null) {
			System.out.println("Hut BBANG!");
		} else {
			pistol.shut();
		}
		
	}
	
}
