package exam04;

class BaseEnSpeaker extends Speaker { //중저음스피커
	
	private int baseRate;
	
	public void setBaseRate(int baseRate) { //초기화 생략.
		this.baseRate = baseRate;
	}
	
	public int getBaseRate() {
		return baseRate;
	}
	
	@Override
	public void showCurrentState() { //상속의 관계하에 메서드 오버라이딩
//		System.out.println("베이스 크기: " + baseRate);
		super.showCurrentState();
//		showCurrentState(); 가까운걸 찾으니 에러.
		System.out.println("베이스 크기: " + getBaseRate());
	}
	
}
