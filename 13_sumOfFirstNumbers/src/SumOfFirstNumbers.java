import java.util.Scanner;

public class SumOfFirstNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num =  sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("Sum is: " + sum);
		
		
		sc.close();
	}
}
