public class OnlineShop {
	public static void main(String[] args) {
		String productName = "Gaming Keyboard";
		char productCode = 'K';
		int stockQuality = 250;
		char productRatingSymbol = 'A';
		int wareHouseNumber = 10_500;
		String availability = "In Stock";
		
		System.out.println("=== Online Shop Inventory Management ===");
		System.out.println("Information                    Value                 Correct Type");
		System.out.println("Product Name             " + productName + "      " + productName.getClass().getSimpleName());
		System.out.println("Stock Quality            " + stockQuality+ "                  " + ((Object)stockQuality).getClass().getSimpleName());
		System.out.println("Product Rating Symbol    " + productRatingSymbol + "                " + ((Object)productRatingSymbol).getClass().getSimpleName());
		System.out.println("Ware House Number        " + wareHouseNumber + "              " + ((Object)wareHouseNumber).getClass().getSimpleName());
		System.out.println("Availability             "+ availability + "          " + availability.getClass().getSimpleName());
		
		
	}

}