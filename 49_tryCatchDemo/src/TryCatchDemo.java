
public class TryCatchDemo {
	public static void main(String[] args) {
		
		System.out.println("before the try-catch block");
		
		try {
			System.out.println("inside the try block beofre an exception");
			System.out.println(2/0);
			System.out.println("inside the try block after the exception");
		}catch(Exception e) {
			System.out.println("Division by zero");
		}
		
		System.out.println("after the try-catch block");
	}
}
