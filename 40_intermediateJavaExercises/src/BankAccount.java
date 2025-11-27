
public class BankAccount {
	private String ownerName;
	private double balance;
	private final double MINIMUM_BALANCE = 1000;

	public BankAccount(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	double deposit(double ammount) {
		System.out.println(" === ACCOUNT TRANSACTION === ");
		System.out.println("You deposited :" + ammount);
		return balance += ammount;
	}

	double withdraw(double ammount) {
		double currentBalance = balance - ammount; //correct

		// ammount > balance return insufficient balance;
		if (ammount > balance) {
			System.out.println(" === ACCOUNT TRANSACTION === ");
			System.out.println("Insufficient Balance");
			return balance;
		}
		// currentBalance <= MINIMUM_BALANCE return Must maintain 1000 balance;
		if (currentBalance < MINIMUM_BALANCE) {
			System.out.println(" === ACCOUNT TRANSACTION === ");
			System.out.println("Must maintain 1000 as Balance");
			return balance;
		}

		System.out.println(" === ACCOUNT TRANSACTION === ");
		System.out.println("You withdraw :" + ammount);
		balance = currentBalance;
		return balance;
	}

	double iswithdraw(double ammount) {	
		double remaining_balance = balance - ammount;
		
		if(remaining_balance < MINIMUM_BALANCE) {
			System.out.println("Withdraw denied : You must maintain atleast " + MINIMUM_BALANCE);
		return balance;
		}
		
		if(balance < ammount) {
			System.out.println("Insufficient funds");
		}
		
		return balance =  remaining_balance;
	}
	
	
	void getBalance() {
		System.out.println(" ==== ACCOUNT DETAILS ==== ");
		System.out.println();
		System.out.println("Account Owner :" + ownerName);
		System.out.println("Your Balance is : " + balance);
	}

	public static void main(String[] args) {

		BankAccount ray = new BankAccount("Raymund", 50_000.00);

		ray.withdraw(15_000.00);
		ray.getBalance();
	}
}
