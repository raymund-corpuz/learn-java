
public class ArrayMinMax {

	public static int[] numArray = {89, 78, 64, 94, 101};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int smallest = findMin(numArray);
		int largest = findMax(numArray);
		
		System.out.println("Min :" + smallest);
		System.out.println("Max :" + largest);

	}

	public static int findMin(int[] arr) {
		int min = arr[0];

		for(int i = 1; i < arr.length; i++) {
			 if(arr[i] < min) {
				 min = arr[i];
			 }	
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
