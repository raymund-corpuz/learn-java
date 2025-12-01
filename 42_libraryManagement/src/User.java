import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Book> borrowedBooks; //correct
	
	//Constructor
	public User(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>(); //correct
	}
	
	//Getter
	public String getName() {
		return name; //correct
	}
	
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			borrowedBooks.add(book);
			book.borrowBook();
			System.out.println(name + " borrowed: " + book.getTitle()); //missing
		}else {
//			System.out.println("Book is already borrowed.");
			System.out.println("Book '"+ book.getTitle() + " is not available.");
		}
	}
	
	public void returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.returnBook();
		}else {
			System.out.println("Book is already returned");
		}
	}
	
	public void listBorrowedBooks() {
		//System.out.println("User: " + user.getName());
		System.out.println(name + "'s Borrowed Books:");

		//if (!borrowedBooks.contains(book)) {
		if(borrowedBooks.isEmpty()) {
			System.out.println("No borrowed books");
		} else {
			for(Book book : borrowedBooks) {
				System.out.println("- " + book.getTitle());
			}
		}
	}
	
	@Override
	public String toString() {
		return "User: " + name + ", BorrowedBooks :" + borrowedBooks.size();
	}
	
}

