import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManagement inventory = new InventoryManagement();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		displayInventory();
		System.out.println("ENTER YOUR CHOICE :");
		choice = sc.nextInt();
		sc.nextLine();
		
		do {
			switch(choice) {
			
			case 1: 
				System.out.println("Enter Product Name: ");
				String itemName = sc.nextLine();
				
				System.out.println("Enter Quantity: ");
				int quantity = sc.nextInt();
				
				System.out.println("Enter Price: ");
				int price = sc.nextInt();
				
				inventory.addItem(itemName, quantity, price);
				break;
				
			case 2:
				System.out.println("Remove Product Name: ");
				String removeItem =sc.nextLine();
				
				inventory.removeItem(removeItem);
				break;
				
			case 3:
				System.out.println("Update Product Name: ");
				String updateItem = sc.nextLine();
				
				System.out.println("Update Quantity: ");
				int updateQuantity = sc.nextInt();
				
				System.out.println("Update Price: ");
				int updatePrice = sc.nextInt();
				
				inventory.updateStock(updateItem, updateQuantity, updatePrice);
				break;
				
				default:
					System.out.println("Invalid Choice!");
					
				case 0:
					System.out.println("EXITING THE PROGRAM...");
					break;
			}
			
		}while(choice != 0);
			sc.close();
		
	}
	
	
	public static void displayInventory() {
		System.out.println(" ======= INVENTORY MANAGEMENT SYSTEM ============ ");
		System.out.println(" 1. ADD ITEM ");
		System.out.println(" 2. REMOVE ITEM ");
		System.out.println(" 3. UPDATE STOCK ");
		System.out.println(" 0. EXIT PROGRAM...");
	}
}
