package exam10;

import java.io.Serializable;

class Circle implements Serializable { //정보 은닉화. 복제를 허용. 직렬화.
	
	int xPos;
	int yPos;
	double rad;
	
	Circle(int xPos, int yPos, double rad) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	public void showCircle() {
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
	
	
}
