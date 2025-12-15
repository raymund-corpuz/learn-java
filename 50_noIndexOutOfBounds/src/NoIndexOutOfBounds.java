import java.util.Scanner;

public class NoIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hardCodeArray = {3,2,4,5,1};
		
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt();
		
		if(index < 0 || index > hardCodeArray.length - 1) {
			System.out.println("The index is out of bounds");
		}else {
			System.out.println(hardCodeArray[index]);
		}
	}

}
