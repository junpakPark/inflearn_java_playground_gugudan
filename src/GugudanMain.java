import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {

		System.out.println("구구단 중 출력할 단은?: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number < 2 || number > 9) {
			System.out.println("2이상, 9 이하의 값만 입력할 수 있습니다.");
		} else {
			int[] result = Gugudan.calculate(number);
			Gugudan.print(result);
		}
	}
}

