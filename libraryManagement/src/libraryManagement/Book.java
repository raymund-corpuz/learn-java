package libraryManagement;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	
	public Book( String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void borrowBook() {
		if(isAvailable) {
			isAvailable = false;
		}else {
			System.out.println("This book is already borrowed");
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			isAvailable = true;
		}else {
			System.out.println("This book is already returned");
		}
	}
	
//	public void toPrint() {
//		System.out.println(" ==== Book Info ==== ");
//		System.out.println("Title :" + title);
//		System.out.println("Author :" + author);
//		System.out.println("Avaialble :" + isAvailable);
//	}
	
	@Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", ISBN: " + isbn +
                ", Available: " + (isAvailable ? "Yes" : "No");
    }


}
