package quiz;

public class MultipleQuiz {
	public static void main(String[] args) {
		// 1~100사이의 (양의) 5의 배수이면서, 7의 배수를 출력.
		System.out.println("=== for ===");
		System.out.println("1~100사이의 (양의) 2의 배수이면서, 5의 배수를 출력.");

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (((i % 2) == 0) && ((i % 5) == 0)) {
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("2 && 5의 배수인 정수 누적 값: " + sum);

		System.out.println("=== while ===");
		int count = 1;

		sum = 0;

		while (count <= 100) {
			if (((count % 2) == 0) && ((count % 5) == 0)) {
				System.out.println(count);
				sum += count;
			}

			count++;
		}

		System.out.println("2 && 5의 배수인 정수 누적 값: " + sum);

		System.out.println("=== do~ while ===");

		count = 1;
		sum = 0;

		do {
			if (((count % 2) == 0) && ((count % 5) == 0)) {
				System.out.println(count);
				sum += count; // sum = sum + i;
			}

			count++;

		} while (count <= 100);

		System.out.println("2 && 5의 배수인 정수 누적 값: " + sum);
	}
}