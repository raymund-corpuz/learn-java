
public class BookClass {
	public static void main(String[] args) {
		
		Book harryPotter =  new Book();
		
		harryPotter.title = "Harry Potter";
		harryPotter.author = "J. K. Rowling";
		harryPotter.year = 1997;
		
		
		
		Book hobbit =  new Book();
		
		hobbit.title = "The Hobbit";
		hobbit.author = "J.R.R Tolkien";
		hobbit.year = 1995;
		
		System.out.println(harryPotter.title + " by " + harryPotter.author +"(" + harryPotter.year + ")");
		System.out.println(hobbit.title + " by " + hobbit.author +"(" + hobbit.year + ")");
	}
}


class Book{
	String title ;
	String author;
	int year;
	
}