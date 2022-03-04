package exam15;

public class PrintfMethod {

	public static void main(String[] args) {
		
		int age = 20;
		double tall = 175.7;
		String name = "홍길동";
		
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.printf("제 이름은 %s 입니다.\n", name);
		System.out.printf("나이는 %d 살이고, 키는 %.1f 입니다.\n", age, tall);
		System.out.printf("%d, 0x%x, 0%o \n", 77, 77, 77);
		System.out.printf("%f %e \n", 0.00014, 0.00014);
		System.out.printf("%g %g \n", 0.00014, 0.000014);
//		%g %e or %f 판단 후 출력, 일반적으로 사용은 하지 않음.
	}

}
