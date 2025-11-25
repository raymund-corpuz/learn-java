import java.util.Scanner;

public class DeepSeekCountingVowels {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String");
        String input = sc.nextLine().toLowerCase();
        int vowelsCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        
        System.out.println("Vowels Count : " + vowelsCount);
        sc.close();
    }
}
