import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		System.out.println("Simple Calculator");
		System.out.println("Choose Operator : add, sub, mul, div");
		String operation = sc.nextLine();

		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		if(operation.equals("add")) {
			result =  num1 + num2;
		}
		else if(operation.equals("sub")) {
			result = num1 - num2;
		}else if(operation.equals("mul")){
			result = num1 * num2;
		}
		else if(operation.equals("div")) {
			result = num1 / num2;
		}
		
		System.out.println("The Result is : " + result);
		
		sc.close();
	}

}
