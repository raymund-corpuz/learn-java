
public class Main {
	public static void main(String[] args) {
		
		System.out.println("=== Testing Bluetooth Device Communication ===\n");
		
		SmartPhone phone = new SmartPhone();
		SmartWatch watch = new SmartWatch();
		
		//now we can test public methods
		
		phone.sendInfoToLaptop("Hello from SmartPhone");
		watch.sendInfoToLaptop("Health data from SmartWatch");
		
		System.out.println("\n=== All devices communicating successfully! ===");
	}
}
