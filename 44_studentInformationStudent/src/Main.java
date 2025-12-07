import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		StudentInformationSystem SIS = new StudentInformationSystem();
		Scanner sc = new Scanner(System.in);	
		
		int choice;
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student Name:");
				String name = sc.nextLine();
				System.out.println("Enter Student Year: ");
				String year = sc.nextLine();
				System.out.println("Enter Student Address: ");
				String address = sc.nextLine();
				
				Student student = new Student(name, year, address);
				SIS.addStudent(student);
				
			case 2: 
				SIS.listOfStudents();
				
			case 3:
				System.out.println("Enter Student Name:");
				String name = sc.nextLine();
				System.out.println("Enter Student Year: ");
				String year = sc.nextLine();
				System.out.println("Enter Student Address: ");
				String address = sc.nextLine();
				
				Student student = new Student(name, year, address);
				SIS.updateStudent(name, year, address);
			}
			
		}while(choice != 0);
		sc.close();

	}
	
	public static void displayMenu() {
		System.out.println("// ==== WELCOME TO STUDENT INFORMATION SYSTEM ==== //");
		System.out.println("1. New Student ");
		System.out.println("2. Show Students ");
		System.out.println("3. Update Student ");
		System.out.println("4. Remove Student ");
		System.out.println("5. New Course ");
		System.out.println("6. Show Courses ");
		System.out.println("7. Update Course ");
		System.out.println("8. Remove Course ");
		System.out.println("0. EXIT PROGRAM ");
		
	}

}
