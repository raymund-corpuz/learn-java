import java.util.Scanner;

public class GradeEvaluator {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter your score: ");
		int grade = sc.nextInt();
		
		if(grade >= 90 && grade <= 100) {
			System.out.println("Your grade is : A");
		}
		else if(grade >= 80 && grade < 90) {
			System.out.println("Your grade is : B");
		}
		else if(grade >= 70 && grade < 80) {
			System.out.println("Your grade is : C");
		}
		else if(grade >= 60 && grade < 70) {
			System.out.println("Your grade is : D");
		}
		else if(grade >= 50 && grade < 60) {
			System.out.println("Your grade is : F");
		}
		else {
			System.out.println("Invalid Grade");
		}
		
		sc.close();
	}
}
