
public class StringFormatMethod {
	public static void main(String[] args) {
		
		int age =22;
		char initial = 'M';
		String surname = "Anderson";
		double height = 1.72;
		
		String details = String.format(
	            "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.",
	            initial, surname, age, height);
		
		System.out.println(details);
	}
}
