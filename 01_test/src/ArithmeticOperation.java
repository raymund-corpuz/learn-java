import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // TODO: Calculate the sum of num1 and num2
        int sum = num1 + num2;
        System.out.println("The Sum is : "+ sum);

        // TODO: Calculate the difference of num1 and num2
            int dif = num1 - num2;
        System.out.println("The difference is : "+ dif);

        // TODO: Calculate the product of num1 and num2
        int product = num1 * num2;
        System.out.println("The product is : "+ product);

        // TODO: Calculate the quotient of num1 divided by num2
        int quotient =  num1 / num2;
        System.out.println("The quotient is : " + quotient);

        scanner.close();
	}
}
