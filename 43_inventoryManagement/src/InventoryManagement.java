import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManagement {
	private ArrayList<Product> products;

	public InventoryManagement() {
		products = new ArrayList<>();
	}

	public Product findProductName(String itemName) {
		for (Product product : products) {
			if (product.getItemName().equals(itemName)) {
				return product;
			}
		}
		return null;
	}

	// ==========================
	// ADD ITEM
	// ==========================

	public void addItem(Product product) {
//		Product product = new Product(itemName, quantity, price);
		products.add(product);
		System.out.println("New Product is Added: " + product.getItemName());

	}

	// ==========================
	// REMOVE ITEM
	// ==========================
	public void removeItem(String itemName) {
		Iterator<Product> iterator = products.iterator();

		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getItemName().equals(itemName)) {
				iterator.remove();
				System.out.println("Product Removed :" + product.getItemName());
				return;
			}
		}
		System.out.println("Product not found: " + itemName);
	}

//	public void removeItem(String itemName) {
//		for (Product product : products) {
//			if (product.getItemName().equals(itemName)) {
//				products.remove(product);
//				System.out.println("Product is removed: " + product.getItemName());
//				System.out.println();
//				
//			}
//		}
//	}

	// ==========================
	// UPDATE ITEM
	// ==========================

	public void updateStock(String itemName, int quantity, int price) {
		for (Product product : products) {
			if (product.getItemName().equals(itemName)) {
				product.setQuantity(quantity);
				product.setPrice(price);
				System.out.println("Product is updated: " + product.getItemName());
				return;
			}
		}
		System.out.println("Product not found: " + itemName);
	}

	// ==========================
	// LIST ITEMS
	// ==========================

	public void listItems() {
		if(products.isEmpty()) {
			System.out.println("No products in inventory.");
			return;
		}
		
		
		System.out.println(" ====== LIST OF ALL PRODUCTS ====== ");
		for (Product product : products) {
			System.out.print("Product name: " + product.getItemName());
			System.out.print(", Product quantity: " + product.getQuantity());
			System.out.print(", Product price: " + product.getPrice());
			System.out.println();

		}
	}
}
