package libraryManagement;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<User> users;
	
	public Library() {
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
	}
	
	 // ---------------------------
    //        ADD METHODS
    // ---------------------------
	public void addBook(Book book) {
		books.add(book);
		System.out.println("You  added a new book :" + book.getTitle());
	}
	
	public void addUser(User user) {
		users.add(user);
		System.out.println("You added a new user :" + user.getName());
	}
	
	// ---------------------------
    //        FIND METHODS
    // ---------------------------
	public Book findBookByTitle(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
	//Find book by ISBN
	public Book findBookByIsbn(String isbn) {
		for(Book book : books) {
			if(book.getIsbn().equalsIgnoreCase(isbn)) {
				return book;
			}
		}
		return null;
	}
	
	 // Find user by name
	public User findUserByName(String name) {
		for(User user: users) {
			if(user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}
	// ---------------------------
    //     BORROW / RETURN
    // ---------------------------
	public void borrowBook(String isbn, String userName) {
		Book book = findBookByIsbn(isbn);
		User user = findUserByName(userName);
		
		if(book == null) {
			System.out.println("Book not found");
			return;
		}
		
		if(user == null) {
			System.out.println("User not found");
			return;
		}
		
		if(book.isAvailable()) {
			user.borrowBook(book);
		}else {
			System.out.println("Book is already borrowed");
		}
	}
	
	public void returnBook(String isbn, String userName) {
		Book book = findBookByIsbn(isbn);
		User user = findUserByName(userName);
		
		
		if(book == null) {
			System.out.println("Book not found");
			return;
		}
		
		if(user == null) {
			System.out.println("User not found");
			return;
		}
		user.returnBook(book);
	}
	
	// ---------------------------
    //       DISPLAY METHODS
    // ---------------------------

	
	 // List all books
	public void listAllBooks() {
		System.out.println(" ------------ All Books in Library ---------- ");
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	//List only available books
	public void listAvailableBooks() {
		System.out.println(" -------- Available Books ------- ");
		for (Book book : books) {
			if (book.isAvailable()) {
				System.out.println(book);
			}
		}
	}
	
	//List all borrowed books
	public void listBorrowedBooks() {
		System.out.println(" -------- Borrowed Books -------- ");
		for(Book book: books) {
			if(!book.isAvailable()) {
				System.out.println(book);
			}
		}
	}
}
