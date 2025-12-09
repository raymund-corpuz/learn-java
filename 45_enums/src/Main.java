
public class Main {
	
	public static void main(String[] args) {
		UserStatus status = UserStatus.ACTIVE;

		UserStatus[] statuses = UserStatus.values();
		
		switch(status){
		case PENDING:
			System.out.println("Wait for few more minutes.");
			break;
		case ACTIVE:
			System.out.println("No problem, You can pass.");
			break;
		case BLOCKED:
			System.out.println("You can't pass");
			break;
			default:
				System.out.println("Unsupported enums");
		}
		
		for(UserStatus stats: UserStatus.values()) {
			System.out.println(stats);
		}
		
	}
	
}
