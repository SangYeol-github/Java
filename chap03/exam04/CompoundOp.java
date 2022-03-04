package exam04;

public class CompoundOp { //복합대입연산자 ("누적" 을 떠올리기)

	public static void main(String[] args) {
		int num = 125;
		//int result = 0;
		
		num += 50; //num = num + 50;    <-50을 누적해줘라
		System.out.println(num);
		
		num -= 50; //num = num - 50;
		System.out.println(num);
		
		num *= 50; //num = num * 50;
		System.out.println(num);
		
		num /= 50; //num = num / 50;
		System.out.println(num);
		
		num %= 50; //num = num & 50;
		System.out.println(num);
		
		
		
		

	}

}
