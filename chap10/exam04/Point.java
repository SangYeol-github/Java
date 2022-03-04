package exam04;

class Point implements Cloneable { //복제 허용, 표시용 ~able
	private int xPos;
	private int yPos;
	
	Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n",xPos,yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

//	@Override
//	public String toString() {
//		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
//	}
	
	
	
	
	
}
