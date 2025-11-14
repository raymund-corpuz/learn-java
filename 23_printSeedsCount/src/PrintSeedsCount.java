
public class PrintSeedsCount {
	public static int countSeeds(int parrotWeight, int parrotAge) {
		return parrotWeight / 5 + parrotAge; //it returns an int
	}
	
	public static void printSeedsCount(int seeds) {
		System.out.println("Give your parrot " + seeds + "g of seeds per day");
	}
	
	public static void main(String[] args) {
		int myParrotWeight = 150;
		int myParrotAge = 3;
		
		int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
		
		printSeedsCount(myParrotPortion);
	}
}
