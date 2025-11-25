import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] vowelsArray = {'a','e','i','o','u'};		
		int vowelsCount = 0;
		System.out.println("Enter a String");
		String input = sc.nextLine();
		char[] inputArray = input.toCharArray();
		
		for(int i =0; i < inputArray.length; i++) {
			for(int j = 0; j < vowelsArray.length; j++) {		
				if(inputArray[i] == vowelsArray[j]) {
					vowelsCount++;
					break;
				}
			}
		}
		System.out.println("Vowels Count : " + vowelsCount);
	}

}
