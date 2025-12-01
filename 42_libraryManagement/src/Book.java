
public class Book {
	private String title; 
	private String author;
	private String isbn;
	private boolean isAvailable; //correct
	
	//Constructor
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author =  author;
		this.isbn = isbn;
		this.isAvailable = true; //correct
	}
	
	//Getters
	public String getTitle() {
		return title; //correct
	}
	
	public String getAuthor() {
		return author; //correct
	}
	
	public String getIsbn() {
		return isbn; //correct
	}
	
	public boolean isAvailable() {
		return isAvailable; //correct
	}
	
	//Methods
	public void borrowBook() {
		if(isAvailable) {
			isAvailable = false;
		}else {
			System.out.println("Book is already borrowed"); //correct
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			isAvailable = true;
		}else {
			System.out.println("Book is already returned"); // wrong return 
		}
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Isbn: " + isbn + ", Available: " + ( isAvailable ? " is availabel.": " not available.");
	}
}
