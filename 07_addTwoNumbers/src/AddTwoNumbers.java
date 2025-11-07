import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int firstNum =  sc.nextInt();
		System.out.println("Enter second number :");
		int secondNum = sc.nextInt();
		System.out.println("Sum = " + (firstNum + secondNum));
	}
}
