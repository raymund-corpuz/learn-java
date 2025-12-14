import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]nums = {1,2,3,4,5};
		
		
		System.out.println("Enter an index :");
		int x = sc.nextInt();
		try {
			
			System.out.println("The value is :" + nums[x] );
		}catch(Exception e) {
			System.out.println("Array Index is out of bounds :" + x);
		}
		
		sc.close();

	}

}
