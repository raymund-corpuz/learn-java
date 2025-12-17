import java.util.Scanner;

public class SafeIntegerInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a digit: ");
		String input = sc.nextLine();
		
		
		try {
			int num = Integer.parseInt(input);
			System.out.println("You entered: " + num);
		}
		catch(Exception e) {
			System.out.println("Invalid digit");
		}
	}
}
