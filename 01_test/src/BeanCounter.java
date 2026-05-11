
public class BeanCounter {
	public static void main(String[] args) {
		String product = "StarBucks";
		String flavor = "Mild Strong";
		int quantity = 5;
		double price = 3.99;
		boolean isOpen = true;
		
		System.out.println("You have order " + quantity + " " + product + " " + flavor + " each cost " + price);
		System.out.println("Total Cost :" + quantity * price);
		System.out.println("We will deliver when the store is open :" + isOpen );
		
	}

}
