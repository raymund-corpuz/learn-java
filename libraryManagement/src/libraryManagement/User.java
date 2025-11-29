package libraryManagement;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Book> borrowedBooks;
	
	public User(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	//Borrow a book
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			borrowedBooks.add(book);
			book.borrowBook();
			System.out.println(name + " borrowed : " + book.getTitle());
		}else {
			System.out.println("Book '" + book.getTitle() + " 'is not available.");
		}
	}
	
	public void returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.returnBook();
			System.out.println(name + " returned :" + book.getTitle());
		}else {
			System.out.println("User doesn't have this book");
		}
	}
	
	//List borrowed book
	public void listBorrowedBooks() {
		System.out.println(name +"'s Borrowed Books :");
		
		if(borrowedBooks.isEmpty()) {
			System.out.println("No borrowed books.");
		}else {
			for(Book book: borrowedBooks) {
				System.out.println("- " + book.getTitle());
			}
		}
	}
	
	//Optional : toString()
	@Override
	public String toString() {
		return "User: " + name + ", Borrowed Books: " + borrowedBooks.size();
	}
}
