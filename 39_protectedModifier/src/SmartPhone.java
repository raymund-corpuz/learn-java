
public class SmartPhone extends MobileGadget {
	
	private Laptop connectedLaptop;
	
	public SmartPhone() {
		this.connectedLaptop = new Laptop();
	}
	
	public void sendInfoToLaptop(String info) {
		printNotification("Sending info to laptop : " + info);
		connectedLaptop.receiveInfo(info);
	}
}
