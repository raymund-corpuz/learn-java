import java.util.Scanner;

public class SimpleAreaCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length :");
		double length = sc.nextDouble();
		System.out.println("Enter width :");
		double width = sc.nextDouble();
		double area = (length * width);
		System.out.println("Area of rectangle = " + area);

	}
}
