import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();

		Scanner sc = new Scanner(System.in);

		seedSampleData(library);

		// Menu Loop
		int choice;

		do {
			displayMenu();
			System.out.println("Enter choice :");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter title: ");
				String title = sc.nextLine();
				System.out.println("Enter author: ");
				String author = sc.nextLine();
				System.out.println("Enter ISBN: ");
				String isbn = sc.nextLine();

				Book book = new Book(title, author, isbn);
				library.addBook(book);
				break;

			case 2:
				System.out.println("Enter username :");
				String name = sc.nextLine();

				User user = new User(name);
				library.addUser(user);
				break;

			case 3:
				System.out.println("Enter ISBN");
				String isbnBorrow = sc.nextLine();

				System.out.println("Enter username :");
				String userBorrow = sc.nextLine();

				library.borrowBook(isbnBorrow, userBorrow);
				break;

			case 4:
				System.out.println("Enter ISBN :");
				String isbnReturn = sc.nextLine();

				System.out.println("Enter username :");
				String userReturn = sc.nextLine();

				library.returnBook(isbnReturn, userReturn);
				break;

			case 5:
				library.listAllBooks();
				break;

			case 6:
				library.listAvailableBooks();
				break;

			case 7:
				library.listBorrowedBooks();
				break;

			default:
				System.out.println("Invalid choice. Try again.");

			case 0:
				System.out.println("Exiting the program...");
				break;

			}
		} while (choice != 0);
		sc.close();

	};

	

	public static void displayMenu() {
		System.out.println("======== Library Management System ========");
		System.out.println("1. Add Book");
		System.out.println("2. Add User");
		System.out.println("3. Borrow Book");
		System.out.println("4. Return Book");
		System.out.println("5. List All Books");
		System.out.println("6. List Available Books");
		System.out.println("7. List Borrowed Books");
		System.out.println("0. Exit");
		System.out.println("===========================================");

	}

	public static void seedSampleData(Library library) {
		library.addBook(new Book("Harry Potter", "J.K. Rowling", "9782"));
		library.addUser(new User("Ray"));
	}
}
