import java.util.Scanner;

public class ProductPriceCalculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter BasePrice: ");
		double basePrice = scanner.nextDouble();
		
		System.out.println("Enter TaxRate: ");
		double taxRate =  scanner.nextDouble();
		
		System.out.println("Enter Discount Ammount: ");
		double discountAmmount = scanner.nextDouble();
		
		double taxAmmount = basePrice * (taxRate/ 100);
		double finalPrice = (basePrice + taxAmmount) - discountAmmount;
		
		
		System.out.printf("Final Price : $%.2f\n", finalPrice);
		
		scanner.close();
	}

}
