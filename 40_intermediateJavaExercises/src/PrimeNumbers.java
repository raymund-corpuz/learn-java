import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int input = sc.nextInt();
		
		if(isPrime(input)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
		sc.close();

//		if(input == 2 || input == 3 || input == 5 || input == 7) {
//			System.out.println("Prime Number");
//		}
//		else if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0) {
//			System.out.println("Not a Prime Number");
//		} else {
//			System.out.println("Prime Number");
//		}

	}
	
	
	public static boolean isPrime(int n) {
		// Handle edge cases
		
		if(n <= 1) return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		//Check odd divisors up to sqrt(n)
		for(int i = 3; i * i <=n; i +=2) {
			if( n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
