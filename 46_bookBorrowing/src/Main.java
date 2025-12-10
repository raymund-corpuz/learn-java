import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<LibraryItem> items = new ArrayList<>();
		
		//Add sample data
		items.add(new Book("Harry Potter", 1));
		items.add(new Magazine("National Geographic", 2));
		items.add(new Book("Clean Code", 3));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n==== Library Items ====");
			for(LibraryItem item: items) {
				System.out.println(item.getId() + " - " + item.getTitle() + " | Available: "+ item.isAvailable()); 
			}
			
			System.out.print("\nEnter ID to borrow (0 to exit): ");
			int id = sc.nextInt();
			
			if(id == 0) break;
			
			//Polymorphism: borrowItem()
			
			boolean found = false;
			
			for(LibraryItem item: items) {
				if(item.getId() == id) {
					item.borrowItem();
					found = true;
				}
			}
			
			if(!found) {
				System.out.println("Invalid ID.");
			}
		}
		
		
		sc.close();
		
	}

}
