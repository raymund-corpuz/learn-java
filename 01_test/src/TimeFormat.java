import java.util.Scanner;
public class TimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int hours = 60;
		
		System.out.println("=== Converting minutes to hours and minutes format ===");
		System.out.println();
		System.out.println("Enter Number of Minutes :");
		int nOfMinutes =  scanner.nextInt();
		
		int onHours = nOfMinutes / hours;
		int onMinutes = nOfMinutes % hours;
		
		System.out.println(onHours + " hours and " + onMinutes + " minutes");

		scanner.close();
	}

}
