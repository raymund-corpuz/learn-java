import java.util.Scanner;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.println(" === Number Format Exception Demo === ");
		System.out.println("Enter a digit :");
		input = sc.nextLine();
		
		if(input.matches("\\d+")) {
			int number = Integer.parseInt(input);
			int result = number + 1;
			System.out.println("Result :" + result);
			System.out.println("Finished!");
		}
		else {
			System.out.println("Incorrect Input :" + input );
			System.out.println("Finished!");
		}
	}

}
