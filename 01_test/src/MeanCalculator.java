import java.util.Scanner;

public class MeanCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		double avg = sum / 2f;
		
		System.out.printf("The Average : %.2f\n", avg);
		
		scanner.close();
	}
}
