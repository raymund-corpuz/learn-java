
 class Book extends LibraryItem {
	

	Book(String title, int id){
		super(title, id);
	}

	@Override
	public void borrowItem() {
		if(isAvailable()) {
			setIsAvailable(false);
			System.out.println("Book borrowed: " + getTitle());
		}else {
			System.out.println("Book is not available" + getTitle());
		}
	}
}
