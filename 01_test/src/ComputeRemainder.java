
import java.util.Scanner;

public class ComputeRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		//compute remainder
		int displayRemainder =  input % 2;
		
		//compute triple
		int multipleByThree = displayRemainder * 3;
		
		System.out.println("Remainder :" + displayRemainder);
		System.out.println("Multiple by three :" + multipleByThree);
		
		scanner.close();
	}
}
