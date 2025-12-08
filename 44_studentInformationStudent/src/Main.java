import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		StudentInformationSystem SIS = new StudentInformationSystem();
		Scanner sc = new Scanner(System.in);	
		
		int choice;
		
		sampleInput(SIS);
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
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
				break;
				
			case 2: 
				SIS.listOfStudents();
				break;
				
			case 3:
				System.out.println("Enter Student Name:");
				String updateName = sc.nextLine();
				System.out.println("Enter Student Year: ");
				String updateYear = sc.nextLine();
				System.out.println("Enter Student Address: ");
				String updateAddress = sc.nextLine();
				
				SIS.updateStudent(updateName, updateYear, updateAddress);
				break;
				
			case 4:
				System.out.println("Enter Student name to remove: ");
				String removeName =sc.nextLine();
				
				SIS.removeStudent(removeName);
				break;
			case 5:
				System.out.println("Enter Course Name:");
				String courseName = sc.nextLine();
				System.out.println("Enter Course Teacher: ");
				String courseTeacher = sc.nextLine();
			
				Course course = new Course(courseName, courseTeacher);
				SIS.addCourse(course);		
				break;
			case 6:
				SIS.listOfCourse();
				break;
			case 7:
				System.out.println("Enter Course :");
				String updateCourse = sc.nextLine();
				
				System.out.println("Enter Course Teacher :");
				String updateTeacher = sc.nextLine();
				
				SIS.updateCourse(updateCourse, updateTeacher);
				break;
			case 8:
				System.out.println("Enter Course to remove :");
				String removeCourse = sc.nextLine();
				
				SIS.removeCourse(removeCourse);
				break;
				default:
					System.out.println("Invalid Input");
					
				case 0:
					System.out.println("EXITING PROGRAM...");
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

	public static void sampleInput(StudentInformationSystem SIS) {
	
		SIS.addStudent(new Student("Raymund", "2025", "Pozorrubio"));
		SIS.addStudent(new Student("Romeo", "2023", "Agoo"));
		SIS.addCourse(new Course("Biology", "Mr.Sanchez"));
		SIS.addCourse(new Course("Comsci", "Mrs. Cruz"));
		
	}
}
