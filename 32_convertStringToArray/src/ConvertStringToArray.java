
public class ConvertStringToArray {
	public static void main(String[] args) {
		
		char[] chars = {'A','B','C','D','E','F'};
		
		String stringFromChars = String.valueOf(chars);
		
		char[] charsFromString = stringFromChars.toCharArray();
		
		String theSameString =  new String(charsFromString);
	
		System.out.println("Result from String From Chars: " + stringFromChars);
		System.out.println("Result from Chars From String: " + theSameString);
	}
}
