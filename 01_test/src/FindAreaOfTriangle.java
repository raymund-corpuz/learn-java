import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Area of Triangle ===");

		System.out.print("Enter Height: ");
		double height = scanner.nextDouble(); // Allows decimals

		System.out.print("Enter Base: ");
		double base = scanner.nextDouble(); // Allows decimals

		// Using 2.0 ensures the division remains a double
		double area = (height * base) / 2.0;

		System.out.println("The Area of a Triangle: " + area);

		scanner.close();

	}

}
