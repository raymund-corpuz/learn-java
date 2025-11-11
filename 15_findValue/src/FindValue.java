import java.util.Scanner;
public class FindValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []num =  new int[5];
		//Read 5 Values
		System.out.println("Enter 5 values");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		//Find the Value
		System.out.println("Enter Search Value");
		int searchValue = sc.nextInt();
		
		boolean isFound = false;
		for(int i= 0; i < num.length; i++) {
			if(searchValue == num[i]) {
				isFound = true;
				break;
			}
		}
		
		if(isFound) {
			System.out.println(searchValue + " is Found");
		}else {
			System.out.println(searchValue + " is Not Found");
		}
		sc.close();
	}

}
