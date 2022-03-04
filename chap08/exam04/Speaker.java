package exam04;

class Speaker {
	
	private int volumeRate;
	
	public void setVolumeRate(int vol) { //초기화 생략.
		this.volumeRate = vol;
	}
	
	public int getVolumeRate() {
		return volumeRate;
	}
	
	public void showCurrentState() {
//		System.out.println("볼륨크키: " + volumeRate);
		System.out.println("볼륨크키: " + getVolumeRate());
	}

	
	
}
