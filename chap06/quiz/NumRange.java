package quiz;

public class NumRange {
	/*
	 * switch문을 활용하여 변경해 보자(단, n의 값은 0 이상의 값이라 가정한다).
	 */
	public static void main(String[] args) {
		int n = 10;

		if (n >= 0 && n < 10) {// (0 <= n < 10)
			System.out.println("0이상 10미만의 수");
		}else if (n >= 10 && n < 20) {
			System.out.println("10이상 20미만의 수");
		}else if (n >= 20 && n < 30) {
			System.out.println("20이상 30미만의 수");
		}else {
			System.out.println("30이상의 수");
		}

		System.out.println("===  switch ===");

		switch (n / 10) {
			case 0:
				System.out.println("0이상 10미만의 수");
				break;
			case 1:
				System.out.println("10이상 20미만의 수");
				break;
			case 2:
				System.out.println("20이상 30미만의 수");
				break;
			default:
				System.out.println("30이상의 수");
				break;
		}
	}
}