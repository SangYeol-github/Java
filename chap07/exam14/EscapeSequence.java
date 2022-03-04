package exam14;

public class EscapeSequence {
	
	public static void main(String[] args) {
		
//		ln = line -> 개행(줄바꿈)
//		System.out.println("프로그램 ");
		System.out.print("프로그램 ");
//		System.out.print("시작.");
		System.out.println("시작.");
		
		System.out.println("친구가 어제 \"잘 다녀왔어?\"라고 물어서...");
		System.out.println("친구가 어제 \n잘 다녀왔어?\n라고 물어서...");
//		\n -> 개행
		System.out.println("친구가 어제 \t잘 다녀왔어?\t라고 물어서...");
//		\t -> space * 4
		System.out.println("c:\\workspaces\\java");
//		\ -> escape
		System.out.println("친구가 어제 '잘 다녀왔어?'라고 물어서...");
		
		
		
	}
}
