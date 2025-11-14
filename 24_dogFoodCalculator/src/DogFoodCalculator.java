
public class DogFoodCalculator {
	
	public static int calculateDogFood(int weight, int age) {
		return weight * 2 + age * 5;
	}
	
	public static void printDogFood(int foodAmount) {
		System.out.println("Your dog needs " + foodAmount + "g of food today");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dogWeight = 20;
		int dogAge = 3;
		
		int dogFood =  calculateDogFood(dogWeight, dogAge);
		
		printDogFood(dogFood);
		
	}

}
