package exam03.has_a;

class Gun {
	
	int bullet;
	public Gun(int bnum) { bullet = bnum; }
	public void shut() {
		if(bullet<=0) {
			System.out.println("Hut BBANG!");
		} else {
			System.out.println("BBANG!");			
		}
		bullet--;
	}
}
