import java.time.LocalDate;
import java.time.LocalDateTime;

public class UniversityEnrollment {
	// Non static members
	String studentName;
	String courseCode;
	String courseName;
	String instructor;
	int capacity;
	
	// Static members
	static int totalCourses;
	static int totalEnrolledStudents;
	static final int universityCapacity = 30;
	static final String UNIVERSITY_CODE = "UNIVERSITY";
	
	// Constructor
	public UniversityEnrollment(String courseName, String instructor, int capacity ){
		this.courseName = courseName;
		this.instructor = instructor;
		this.capacity =  capacity;
	}
	
	// Non static methods
	int enrollStudent(String studentName) {
		if(capacity > capacity) {
			System.out.println(studentName + " Should go to waitlist");
			return capacity;
		}else {
			System.out.println(studentName + " Should succeed");
			return capacity++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniversityEnrollment cs101 = new UniversityEnrollment("Programming", "Dr. Johnson", 2);
		
		cs101.enrollStudent("Bob");
		cs101.enrollStudent("Alice");
		cs101.enrollStudent("Mike");
	}

}
