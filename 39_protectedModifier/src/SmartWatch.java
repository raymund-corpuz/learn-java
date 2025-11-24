
public class SmartWatch extends MobileGadget {
	private int avgHeartRate;
	private Laptop connectedLaptop;
	
	public SmartWatch() {
		this.avgHeartRate = 75;
		this.connectedLaptop = new Laptop();
	}
	
	private int countHeartRate() {
		System.out.println("Counting heart rate");
		return avgHeartRate;
	}
	
	public void sendInfoToLaptop(String info) {
		printNotification("Sending info to laptop : " + info);
		connectedLaptop.receiveInfo(info);
	}
}
