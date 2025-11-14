
public class MonthlyElectricBill {
	
	public static double calculateUsageCost(double kwhUsed) {
		
		if(kwhUsed <= 100) {
			return kwhUsed * 8;
		}else if(kwhUsed <= 300) {
			return 100 * 8 + (kwhUsed - 100) * 10;
		}else {
			return 100 * 8 + 200 * 10 + (kwhUsed - 300) * 12;
		}
	}
	
	public static double addFees(double baseCost) {
		
		double environmentalFee =  baseCost * 0.05;
		double maintenanceFee = 50;
		
		return baseCost + environmentalFee + maintenanceFee;
	}
	
	public static void printBill(double total) {
		
		System.out.println("Your total electricity bill is: " + total);
	}
	
	public static void main(String[] args) {
		double kwhUsed = 257.5;
		
		double baseCost = calculateUsageCost(kwhUsed);
		double totalBill = addFees(baseCost);
		
		printBill(totalBill);
		
	}
}
