
public class ConcatenateString {
	public static void main(String[] args) {
		String hello = "Hello World";
		String number = String.valueOf(100);
		String booleanLiteral = String.valueOf(true);
		
		String java = "Welcome to Java";
		String num1 = String.valueOf(100_000);
		String booleanValue = String.valueOf(false);
		
		System.out.println(hello + " " + number + " " + booleanLiteral);
		System.out.println(java + " " + num1 +" " +  number + " " + booleanValue);
	}
}
