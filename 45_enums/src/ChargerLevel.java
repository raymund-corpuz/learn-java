
public enum ChargerLevel {
	FULL(4, "green"), HIGH(3, "green"), MEDIUM(2,"yellow"), LOW(1, "red");
	
	private int sections;
	private String color;
	
	ChargerLevel(int sections, String color){
		this.sections = sections;
		this.color = color;
	}
	
	public int getSections() {
		return sections;
	}
	
	public String getColor() {
		return color;
	}
	
	public static ChargerLevel findByNumberOfSections(int sections) {
		for(ChargerLevel value: values()) {
			if(value.sections == sections) {
				return value;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(ChargerLevel.findByNumberOfSections(3));
	}
}
