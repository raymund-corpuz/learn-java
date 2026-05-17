import java.util.Scanner;

public class SquirrelAndNuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== Squirrel and Nuts ===");
		System.out.println();
		System.out.println("Enter Number of Squirrels :");
		int squirrels = scanner.nextInt();
	
		System.out.println("Enter Number of Nuts :");
		int nuts = scanner.nextInt();
		
		int result = nuts % squirrels;
		System.out.println("Result :" + result);
		
		scanner.close();
	}

}
