import java.util.Scanner;

public class SimpleLoginSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String username = "user123";
		String password = "pass123";

		System.out.println("Enter username :");
		String myUsername = sc.nextLine();

		System.out.println("Enter password :");
		String myPassword = sc.nextLine();

		 if (username.equals(myUsername)) {
			if(password.equals(myPassword)) {
				System.out.println("Login successful!");
			}else {
				System.out.println("Invalid password!");
			}
		} else {
			System.out.println("Invalid username");
		}

		sc.close();

	}
}
