public class Gugudan {
	// public static void main(String[] args) {
	// 배열
	// int[] result = new int[9];
	// for (int i = 0; i < result.length; i++) {
	// 	result[i] = 2 * (i + 1);
	// }
	// for (int i = 0; i < result.length; i++) {
	// 	System.out.printf("2 * %d = %d%n", i + 1, result[i]);
	// }

	// 반복문, 조건문, 입력
	// System.out.println("구구단 중 출력할 단은?: ");
	// Scanner scanner = new Scanner(System.in);
	// int number = scanner.nextInt();
	//
	// if (number < 2 || number > 9) {
	// 	System.out.println("2이상, 9 이하의 값만 입력할 수 있습니다.");
	// } else {
	// 	for (int i = 1; i <= 9; i++) {
	// 		System.out.printf("%d * %d = %d%n", number, i, number * i);
	// 	}
	// }
	// }

	public static int[] calculate(int times) {
		int[] result = new int[9];

		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int j : result) {
			System.out.println(j);
		}
	}
}

