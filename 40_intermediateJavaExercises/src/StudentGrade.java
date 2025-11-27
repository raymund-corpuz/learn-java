import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] grades = new int[5];
		int sum = 0;
		
		System.out.println("Enter your Grade");
		for(int i= 0; i < grades.length; i++) {
			int input = sc.nextInt();
			sum += input;
		}
		double finalGrade = sum / grades.length;
		System.out.println("Your grade :" + finalGrade);
	}
}
