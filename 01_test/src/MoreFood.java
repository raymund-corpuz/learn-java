import java.util.Scanner;

public class MoreFood {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (;;) {
			System.out.println("Do you want some food? ");
			String answer = input.nextLine();
			if (answer.equals("yes")) {
				System.out.println("Here you go!");
			} else if (answer.equals("no")) {
				System.out.println("Ok... :(");
				break;
			}

		}
		input.close();

	}
}
