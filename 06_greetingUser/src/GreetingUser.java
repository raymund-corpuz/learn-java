import java.util.Scanner;

public class GreetingUser {
	public static void main(String[] args) {
		
		Scanner scanUser =  new Scanner(System.in);
		
	
		System.out.println("Enter your username: ");
		String username = scanUser.nextLine();
		System.out.println("Hello, " + username +"!" + " Welcome to Java.");
		
	}

}
