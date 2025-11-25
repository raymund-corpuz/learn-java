import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter how many Fibonacci numbers to generate:");
		int input = sc.nextInt();
		
		System.out.println("Fibonacci Sequence");
		printFibonacci(input);
		
		sc.close();
	}
	
	public static void printFibonacci(int n) {
		if(n <= 0) {
			System.out.println("Please enter a positive number");
			return;
		}
		
		int prev = 0;
		int next = 1;
		
		System.out.print(prev);
		
		if(n==1) return;
		
		//Print second number;
		System.out.print(", " + next);
		
		//Generate and print remaining numbers
		for(int i = 2; i < n; i ++) {
			int sum =  prev + next;
			System.out.print(", " + sum);
			
			//Update for next iteration
			prev = next;
			next = sum;
		}
		System.out.println(); //new line at end
	}
	
//	public static int checkSequence(int n) {
//		
//		int prev;
//		int next;
//		int res;
//		
//		for(int i = 0; i <= n; i++) {
//			
//			prev = i;
//			next = prev + (i+1);
//			res = prev + next;
//			System.out.println(prev + " + " + next + " = " + res);
//			
//			next = prev;
//			prev = res;
//		}
//		return n;
//	}
}
