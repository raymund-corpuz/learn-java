
public class CarClass {
	public static void main(String[] args) {
		
		Car toyota =  new Car();
		Car honda =  new Car();
		Car ford = new Car();
		
		
		toyota.brand = "Toyota";
		toyota.model ="Corolla";
		toyota.year =  2018;
		
		honda.brand = "Honda";
		honda.model = "Civic";
		honda.year = 2020;
		
		ford.brand = "Ford";
		ford.model = "Mustang";
		ford.year = 2023;
		
		System.out.println(toyota.brand + " " + toyota.model + " ("+ toyota.year +") ");
		System.out.println(honda.brand + " " + honda.model + " ("+ honda.year +") ");
		System.out.println(ford.brand + " " + ford.model + " ("+ ford.year +") ");
	}
}


class Car{
	String brand;
	String model;
	int year;
}