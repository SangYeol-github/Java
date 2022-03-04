package exam04;

class InstanceTypeShower {
	
	int showCnt;
	
	InstanceTypeShower() {
		showCnt = 0; 
	}
	
	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}
	
	public <T, U> void showMultiInstType(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
		showCnt++;
	}
	
	public void showPrintCnt() {
		System.out.println("메서드 호출 수:  " + showCnt);
	}
}
