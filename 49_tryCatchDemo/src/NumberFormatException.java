import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("Enter a number");
		input = sc.nextLine();
		
		try {
			int x = Integer.parseInt(input);
			System.out.print("Here is the Result. ");
			System.out.println(x+ 10);
		}catch(Exception e) {
			System.out.println("Can't convert into number");
		}
	}

}
