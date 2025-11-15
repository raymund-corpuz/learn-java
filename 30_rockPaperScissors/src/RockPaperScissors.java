import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static String getComputerChoice() {
		Random random = new Random();	
		int randomComputerChoice =  random.nextInt(3);	
		String[] rockPaperScissors = {"rock", "paper", "scissors"};
		return rockPaperScissors[randomComputerChoice];
	}

	public static String getHumanChoice(Scanner scanner) {
		
		System.out.println("Enter rock, paper, scissors");
		String userInput =  scanner.next();
		return userInput;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
				
		int humanScore = 0;
		int computerScore = 0;
		
			while(humanScore < 5 && computerScore < 5 ) {
			
				String human = getHumanChoice(scanner);
				String computer = getComputerChoice();
				
				if(human.equals(computer)) {
					System.out.println(" ======= It's a tie ========= ");
				}
				else if(human.equals("rock") && computer.equals("scissors") || human.equals("scissors") && computer.equals("paper") ||
						human.equals("paper") && computer.equals("rock")) {
					System.out.println("Human: "+ human);
					System.out.println("Computer: " + computer);
					System.out.println();
					++humanScore;
					System.out.println("🎉 Congratulations You Win 🎉");		
					System.out.println("Human Score: "+ humanScore );
					System.out.println("Computer Score: "+ computerScore);				
				}
				else {
					System.out.println("Human: "+ human);
					System.out.println("Computer: " + computer);
					System.out.println();
					++computerScore;
					System.out.println("❌ Computer Wins, You loose");
					System.out.println("Human Score: "+ humanScore );
					System.out.println("Computer Score: "+ computerScore);				
				}
			}		
			
			if(humanScore == 5) {
				System.out.println("==== Congratulations User Wins ====");
			}else if(computerScore == 5) {
				System.out.println("==== Computer Wins, Try again ====");
			}	
			
	}

}
