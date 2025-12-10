
class Magazine extends LibraryItem{

	public Magazine(String title, int id) {
		// TODO Auto-generated constructor stub
		super(title, id);
	}

	@Override
	public void borrowItem() {
		if(isAvailable()) {
			setIsAvailable(false);
			System.out.println("Borrowed Item :" + getTitle());
		}else {
			System.out.println("Magazine is not available: " + getTitle());
		}
	}
}
