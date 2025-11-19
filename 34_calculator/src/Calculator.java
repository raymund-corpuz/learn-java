import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//ask user to input number
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		//ask user to choose operator
		System.out.println("Enter an operator + , - , * , / ");
		String operator = sc.next();
		
		System.out.println("Enter second number");
		int num2 =  sc.nextInt();
		
		//show result
		switch(operator) {
		case "+" :
			System.out.println("Answer :" + add(num1, num2));
			break;
			
		case "-" :
			System.out.println("Answer :" + sub(num1, num2));
			break;
			
		case "*":
			System.out.println("Answer :" + mul(num1, num2));
			break;
		case "/":
			System.out.println("Answer :" + div(num1, num2));
			break;
			
			default:
				System.out.println("Invalid Operator");
		}
		
		sc.close();
	}
	
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}

	

}
