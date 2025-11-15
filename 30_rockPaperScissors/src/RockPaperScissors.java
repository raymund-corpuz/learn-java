import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static String getComputerChoice() {
		Random random = new Random();	
		int randomComputerChoice =  random.nextInt(3);	
		String[] rockPaperScissors = {"rock", "paper", "scissors"};
		return rockPaperScissors[randomComputerChoice];
	}

	public static String getHumanChoice() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter rock, paper, scissors");
		String userInput =  scanner.next();
		scanner.close();
		return userInput;
	}
	
	public static void evaluate() {
		String human = getHumanChoice();
		String computer = getComputerChoice();
		
		if(human.equals(computer)) {
			System.out.println(" ======= It's a tie ========= ");
		}
		else if(human.equals("rock") && computer.equals("scissors") || human.equals("scissors") && computer.equals("paper") ||
				human.equals("paper") && computer.equals("rock")) {
			System.out.println("Human: "+ human);
			System.out.println("Computer: " + computer);
			System.out.println();
			System.out.println("🎉 Congratulations You Win 🎉");
		}
		else {
			System.out.println("Human: "+ human);
			System.out.println("Computer: " + computer);
			System.out.println();
			System.out.println("❌ Computer Wins, You loose");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int humanScore = 0;
		int computerScore = 0;
		
		evaluate();
	}

}
