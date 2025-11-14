
public class ArraysIsBroken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,10,6};
		
		boolean broken = false; //suppose the array is broken
	
		/* iterating over the array */
		for(int i = 1; i < numbers.length; i ++) { 
			if(numbers[i] < numbers[i-1]) { // if the order is broken
				broken =  true; // write a result
				break; //terminate the loop
			}
		}
		
		if(broken) {
			System.out.println("BROKEN");
		}else {
			System.out.println("OK");
		}

	}

}
