import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static String getComputerChoice() {
		Random random = new Random();	
		int randomComputerChoice =  random.nextInt(3);
		
		String[] rockPaperScissors = {"rock", "paper", "scissors"};
		
		return rockPaperScissors[randomComputerChoice];
	}

	public static void getHumanChoice() {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter rock, paper, scissors");
		String userInput =  scanner.next();
		
		System.out.println("User Choice: " + userInput);
		
		scanner.close();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int humanScore = 0;
		int computerScore = 0;
		
		getHumanChoice();
		System.out.println("Computer Choice :" + getComputerChoice());
	}

}
