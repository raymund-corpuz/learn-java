
public class BankAccount {
	
	// ==== NON STATIC MEMBERS ==== //
	public int accountNumber;
	public String accountHolderName;
	public double balance;

	// === STATIC MEMBERS === //
	public static int accountsCreate;
	public static int allAccounts;
	public static final String BANKCODE = "GWAPO";
	public static final double MINIMUM_BALANCE = 10000.0;
	
	double deposit(double ammount) {
		return balance += ammount;
	}
	
	double withdraw(double ammount) {	
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
	
	void getAccountInfo() {
		System.out.println(" === ACCOUNT INFO ===");
		System.out.println("Account No        : " + accountNumber);
		System.out.println("Account Name      : " + accountHolderName);
		System.out.println("Balance           : " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount raymund = new BankAccount();
		
		raymund.accountNumber = 20220009;
		raymund.accountHolderName = "Raymund Corpuz";
		raymund.balance = 10000.0;
		
		raymund.deposit(50000.0);
		raymund.withdraw(50000.0);
		raymund.getAccountInfo();
		
		
	}

}
