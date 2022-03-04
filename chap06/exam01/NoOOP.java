package exam01;

public class NoOOP {

	public static void main(String[] args) {
		
		int hongKilDong_Quiz1 = 85, hongKilDong_MidTerm = 80,
			hongKilDong_Quiz2 = 90, hongKilDong_FinalTerm = 95;
		
		int KangKamChan_Quiz1 = 75, KangKamChan_MidTerm = 60,
			KangKamChan_Quiz2 = 80, KangKamChan_FinalTerm = 100;
		
		int LeeSunShin_Quiz1 = 95,  LeeSunShin_MidTerm = 90,
			LeeSunShin_Quiz2 = 85,  LeeSunShin_FinalTerm = 80;
		
		int YouKanSun_Quiz1 = 75,   YouKanSun_MidTerm = 90,
			YouKanSun_Quiz2 = 95,   YouKanSun_FinalTerm = 100;
		
		int AnJunKun_Quiz1 = 85, 	AnJunKun_MidTerm = 80,
			AnJunKun_Quiz2 = 85, 	AnJunKun_FinalTerm = 80;
		
		int hongKilDong_Sum = sum(hongKilDong_Quiz1,hongKilDong_MidTerm,hongKilDong_Quiz2,hongKilDong_FinalTerm);
		
		int hongKilDong_Avg = average(hongKilDong_Sum);
	}
	
	public static int sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}
	
	public static int average(int s) {
		return s / 4;
	}
}
