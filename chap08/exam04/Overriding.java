package exam04;

public class Overriding {

	public static void main(String[] args) {
		
		Speaker speaker = new Speaker();
		
		speaker.setVolumeRate(7);
		speaker.showCurrentState();
		
		System.out.println("\n\n==============");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		
		
		baseSpeaker.setVolumeRate(8);
		baseSpeaker.setBaseRate(5);
		baseSpeaker.showCurrentState();

		System.out.println("\n\n==============");
		
		Speaker speaker2 = new BaseEnSpeaker();
//		다형성 -> 상속하에 부모의 참조자료형으로 다양한 형태로 인스턴스 가능 
		
		speaker2.setVolumeRate(5);
		System.out.println(speaker2.getVolumeRate());
		
//		speaker2.setBaseRate(7); //호출 불가능.
		
		speaker2.showCurrentState();
		
	}

}
