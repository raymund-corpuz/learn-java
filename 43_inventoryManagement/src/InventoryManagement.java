import java.util.ArrayList;

public class InventoryManagement {
	private ArrayList<Product> products;
	
	public InventoryManagement() {
		products = new ArrayList<>();
	}
	
	public Product findProductName(String itemName) {
		for(Product product : products) {
			if(product.getItemName() == itemName) {
				return product;
			}
		}
		return null;
	}
	
	// ==========================
	//     ADD ITEM
	// ==========================
	
	public void addItem(String itemName, int quantity, int price) {
		Product product = new Product(itemName, quantity, price);
		products.add(product);
		System.out.println("New Product is Added: " + product.getItemName());
		System.out.println();
	}

	// ==========================
	// REMOVE ITEM
	// ==========================
	public void removeItem(String itemName) {
		for (Product product : products) {
			if (product.getItemName().equals(itemName)) {
				products.remove(product);
				System.out.println("Product is removed: " + product.getItemName());
				System.out.println();
			}
		}
	}
	
	// ==========================
	// UPDATE ITEM
	// ==========================
	
	public void updateStock(String itemName, int quantity, int price) {
		for(Product product : products) {
			if(product.getItemName().equals(itemName)) {
				product.setItemName(itemName);
				product.setQuantity(quantity);
				product.setPrice(price);
				System.out.println("Product is updated: " + product.getItemName());
				System.out.println();
			}
		}
	}

}
