import java.util.ArrayList; //correct

import libraryManagement.Book;

//import libraryManagement.Book;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<User> users; //correct
	
	//Constructor
	public Library() {
		this.books = new ArrayList<>(); 
		this.users = new ArrayList<>(); //correct
	}
	
	//setters
	public void addBook(Book book){
		books.add(book); //correct
		System.out.println("Book added: " + book.getTitle()); //missing
	}
	public void addUser(User user) {
		users.add(user); //correct
		System.out.println("User registered: " + user.getName());
	}
	
	//methods
	public Book findBookByTitle(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
	
	public Book findBookByIsbn(String isbn) {
		for(Book book: books) {
			if(book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null; //correct
	}
	
	public User findUserByName(String name) {
		for(User user: users) {
			if(user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null; //correct
	}
	
	public void borrowBook(String isbn, String userName) {
		Book book = findBookByIsbn(isbn);
		User user = findUserByName(userName);
		
		if(book == null) {
			System.out.println("Book Not Found");
			return;
		}
		
		if(user == null) {
			System.out.println("User Not Found");
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
			System.out.println("Book Not Found");
			return;
		}
		
		if(user == null) {
			System.out.println("User Not Found");
			return;
		}
		
	 user.returnBook(book);
	}
	
	public void listAllBooks() {
		System.out.println("Library Book :");
		
		for(Book book: books) {
			System.out.println(book.getTitle()); //correct
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
