import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Arithmetic Expression ===");
		System.out.println("Title:  Horner-form evaluation of a cubic polynomial.");
		System.out.println("Enter a Number :");
		int n = scanner.nextInt();
		
		int result = ((n + 1) * n + 2) * n + 3;
		System.out.println("Result :" + result);
		scanner.close();

	}

}
