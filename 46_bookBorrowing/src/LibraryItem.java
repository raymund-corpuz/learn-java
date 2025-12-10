
public abstract class LibraryItem {

		// TODO Auto-generated constructor stub
		
		private String title;
		private int id;
		private boolean isAvailable;
		
		public LibraryItem(String title, int id) {
			// TODO Auto-generated constructor stub
			this.title = title;
			this.id = id;
			this.isAvailable = true;
		}
		
		public String getTitle() {
			return title;
		}

		public boolean isAvailable() {
			return isAvailable;
		}
		
		public int getId() {
			return id;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setIsAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		
		public abstract void borrowItem();
}
