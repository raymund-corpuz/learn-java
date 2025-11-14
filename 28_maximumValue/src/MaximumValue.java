import java.util.Scanner;

public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		
		int[] nums =  new int[5];
		
		System.out.println("Enter 5 values");	
		
		for(int i = 0; i < nums.length; i++) {
			int input = scanner.nextInt();
			nums[i] = input;
		}
		
		int largest = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(largest <= nums[i]) {
				largest = nums[i];
			}
		}
		
		System.out.println("The largest value is: " + largest);
		
		scanner.close();

	}

}
