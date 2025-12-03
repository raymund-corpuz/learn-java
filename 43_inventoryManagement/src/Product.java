
public class Product {
	
	private String itemName;
	private int quantity;
	private int price;
	
	public Product(String itemName, int quantity, int price) {
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
	//getters
	public String getItemName() {
		return itemName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	//setter
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
