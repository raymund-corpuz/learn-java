package libraryManagement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);

		
		//Optional : add sample data
		seedSampleData(library);
		
		int choice;
		
		do {
			displayMenu();
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume leftover newline
			
			switch(choice){
			case 1:// Add Book
			System.out.print("Enter title: ");
			String title = sc.nextLine();
			
			System.out.println("Enter author: ");
			String author = sc.nextLine();
			
			System.out.println("Enter ISBN: ");
			String isbn = sc.nextLine();
			
			Book book = new Book(title, author, isbn);
			library.addBook(book);
			break;
			
			case 2: // Add User
				System.out.println("Enter user name: ");
				String name = sc.nextLine();
				
				User user = new User(name);
				library.addUser(user);
				break;
				
			case 3: // Borrow Book
				System.out.println("Enter ISBN: ");
				String isbnBorrow = sc.nextLine();
				
				System.out.println("Enter user name: ");
				String userBorrow = sc.nextLine();
				
				library.borrowBook(isbnBorrow, userBorrow);
				break;
				
			case 4: //Return book
				System.out.println("Enter ISBN: ");
				String isbnReturn = sc.nextLine();
				
				System.out.println("Enter user name: ");
				String userReturn = sc.nextLine();
				
				library.returnBook(isbnReturn,  userReturn);;
				break;
				
			case 5: //List all Books
				library.listAllBooks();
				break;
				
			case 6: // List available books
				library.listAvailableBooks();
				break;
				
			case 7: //List borrowed books
			library.listBorrowedBooks();
			break;
			
			case 0:
				System.out.println("Exiting program...");
				break;
				default:
					System.out.println("Invalid choice. Try again");
			}
			System.out.println(); // Line space
		}
		while(choice != 0);
		sc.close();
		
	}
	
	// MENU UI
	public static void displayMenu() {
		System.out.println("======== Library Management System =======");
		System.out.println("1. Add Book");
		System.out.println("2. Add User");
		System.out.println("3. Borrow Book");
		System.out.println("4. Return Book");
		System.out.println("5. List All Books");
		System.out.println("6. List Available Books");
		System.out.println("7. List Borrowed Books");
		System.out.println("0. Exit");
		System.out.println("==========================================");
	}
	
	// OPTIONAL: Add sample books and users
	public static void seedSampleData(Library library) {
		library.addBook(new Book("Harry Potter", "J.K. Rowling", "9781"));
		library.addBook(new Book("Atomic Habits", "James Clear","9782"));
		library.addBook(new Book ("The Hobbit", "J.R.R. Tolkien", "9783"));
		
		library.addUser(new User("Ray"));
		library.addUser(new User("Mark"));
	}

}
