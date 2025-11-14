import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		
		
		System.out.println("Enter the size of values");
		int size =  scanner.nextInt();
		int[] arraySize =  new int[size];	
		
		System.out.println("Enter values");
		
		for(int i = 0; i < arraySize.length; i++) {
			int input = scanner.nextInt();
			arraySize[i] = input;
		}
		
		int sum = 0;
		for(int i = 0; i < arraySize.length; i++) {		
			sum += arraySize[i];
		}
		
		System.out.println("The sum is: " + sum);
		
		scanner.close();

	}

}
