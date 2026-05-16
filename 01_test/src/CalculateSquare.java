import java.util.Scanner;

public class CalculateSquare {

	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		//Calculate and print square of n
		int squareOfN = n * n;
		System.out.println("Square of " + n + " is " + squareOfN);
		
		//Calculate and print cube of n
		int cubeOfN = n * n * n;
		System.out.println("Cube of " + n + " is " + cubeOfN);
		
		//Calculate and print fourth power of n
		int fourthPowerOfN =  n *n*n*n ;
		System.out.println("Fourth Power of " + n + " is " + fourthPowerOfN);
		
		sc.close();
	}
}
