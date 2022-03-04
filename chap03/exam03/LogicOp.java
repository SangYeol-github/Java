package exam03;

public class LogicOp { //논리연산자(&&, ||, !)

	public static void main(String[] args) {
		
		boolean X1 = false, X2 = false;   //false=0, true는 0만 아니면 됨 으로 맵핑
		
		System.out.println(X1 + " && " +  X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " +  X2 + " = " + (X1 || X2));
		
		System.out.println();
		
		X2 = true;
		System.out.println(X1 + " && " +  X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " +  X2 + " = " + (X1 || X2));
		
		System.out.println();
		
		X1 = true; X2 = false;
		System.out.println(X1 + " && " +  X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " +  X2 + " = " + (X1 || X2));
		
		System.out.println();
		
		X1 = true; X2 = true;
		System.out.println(X1 + " && " +  X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " +  X2 + " = " + (X1 || X2));
		
		System.out.println();
		
		System.out.println(!X1);
		
		
		
	}

}
