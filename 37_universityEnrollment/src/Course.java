import java.util.List;
import java.util.ArrayList;

public class Course {

	// === NON-STATIC MEMBERS (Instance-specific) ==== //
	private String courseCode;
	private String courseName;
	private String instructor;
	private int capacity;
	private List<String> enrolledStudents;
	private List<String> waitlist;

	// ==== STATIC MEMBERS (University-wide) ==== //
	private static int totalCourses = 0;
	private static int totalEnrolledStudents = 0;
	private static final int UNIVERSITY_CAPACITY = 1000;
	private static final String UNIVERSITY_CODE = "UNI-2024";

	// ==== CONSTRUCTOR ==== //
	public Course(String courseName, String instructor, int capacity) {
		this.courseCode = generateCourseCode();
		this.courseName = courseName;
		this.instructor = instructor;
		this.capacity = capacity;
		this.enrolledStudents = new ArrayList<>();
		this.waitlist = new ArrayList<>();
		totalCourses++;
		System.out.println("Course created: " + courseCode + "-" + courseName);
		
	}
// ==== STATIC METHODS ==== //
    
    /**
     * Generates unique course codes using university code and timestamp
     */
	private static String generateCourseCode() {
		return UNIVERSITY_CODE + "-COURSE-"+ System.currentTimeMillis();
	}
	
	 /**
     * Checks if university has capacity for more students
     */
	
	public static boolean hasUniversityCapacity() {
		return totalEnrolledStudents < UNIVERSITY_CAPACITY;
	}
	
	 /**
     * Displays university-wide statistics
     */
	public static void getUniversityStats() {
		System.out.println("\n === UNIVERSITY STATISTCS");
		System.out.println("Universisty Code: " + UNIVERSITY_CODE);
		System.out.println("Total Courses: " + totalCourses);
		System.out.println("Total Enrolled Students :" + totalEnrolledStudents);
		System.out.println("University Capacity: " + UNIVERSITY_CAPACITY);
		System.out.println("Available University Slots: " + (UNIVERSITY_CAPACITY - totalEnrolledStudents ));
		System.out.println("University Full: " + (totalEnrolledStudents >= UNIVERSITY_CAPACITY));
		
	} 
	
 // ==== INSTANCE METHODS ==== //
    
    /**
     * Enrolls a student in the course
     */
	
	public boolean enrollStudent(String studentName) {
		//Check university capacity first
		
		if(!hasUniversityCapacity()) {
			System.out.println("Enrollment failed: University at full capacity! Cannot enroll " +studentName);
			return false;
		}
		
		// Check if student is already enrolled
		if(enrolledStudents.contains(studentName)){
			System.out.println("Enrollment failed :" + studentName + " is already enrolled in " + courseCode);
			return false;
		}
		
		//check course capacity
		if(enrolledStudents.size() < capacity) {
			enrolledStudents.add(studentName);
			totalEnrolledStudents++; //Update Static counter
			System.out.println("Successfully enrolled " + studentName + " in " + courseCode);
			return true;
		}else {
			//course is full, add to waitlist
			addToWaitlist(studentName);
			return false;
		}

	}
	
	
	  
    /**
     * Drops a student from the course
     */
	public boolean dropStudent(String studentName) {
		if(enrolledStudents.remove(studentName)) {
			totalEnrolledStudents--;
			System.out.println("Successfully dropped " + studentName + " from " + courseCode);
			
			//Auto-enroll first student from waitlist if available
			if(!waitlist.isEmpty()) {
				String nextStudent = waitlist.remove(0);
				enrolledStudents.add(nextStudent);
				totalEnrolledStudents++; //Update static counter
				System.out.println("Auto-enrolled " + nextStudent + "from waitlist to " + courseCode );
				
			}
			return  true;
		}else if(waitlist.remove(studentName)) {
			System.out.println("Removed " + studentName + " from waitlist of " + courseCode);
			return true;
		}else {
			System.out.println("Drop failed : " + studentName + " not found in " + courseCode);
			return false;
		}
	}
	
	  /**
     * Adds student to course waitlist
     */
	private void addToWaitlist(String studentName) {
		if(!waitlist.contains(studentName)) {
			waitlist.add(studentName);
			System.out.println("Course " + courseCode + " is full. Added " + studentName + " to waitlist. Position: " + waitlist.size());
			
		}else {
			System.out.println("Student " + studentName + " is already on waitlist for " + courseCode);
		}
	}
	
	/**
     * Returns list of enrolled students
     */
	public int getAvailableSlots() {
		return capacity - enrolledStudents.size();
	}
	
	 /**
     * Returns waitlist information
     */
	public List<String> getWaitlist(){
		return new ArrayList<>(waitlist);
	}

	 /**
     * Displays course information
     */
	
	public void getCourseInfo() {
		   System.out.println("\n=== COURSE INFORMATION ===");
	        System.out.println("Course Code: " + courseCode);
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Instructor: " + instructor);
	        System.out.println("Capacity: " + capacity);
	        System.out.println("Enrolled: " + enrolledStudents.size() + " students");
	        System.out.println("Available Slots: " + getAvailableSlots());
	        System.out.println("Waitlist: " + waitlist.size() + " students");
	        System.out.println("Enrolled Students: " + enrolledStudents);
	        System.out.println("Waitlisted Students: " + waitlist);
	}
	
	
	// === GETTERS === //
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getInsructor() {
		return instructor;
	}
	public int getCapacity() {
		return capacity;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" ===== UNIVERSITY COURSE ENROLLMENT SYSTEM ===== \n ");
		
		
		//Create courses
		
		Course math101 = new Course("Calculus I", "Dr. Smith", 3);
		Course cs101 = new Course("Introduction to Programming" , "Dr. Johnson", 2);
		Course physics201 =  new Course("Advanced Physics", "Dr. Wilson", 4);
		
		System.out.println("\n --- Testing Entrollment Scenarios ---");
		
		 
        // Test 1: Normal enrollments
        math101.enrollStudent("Alice");
        math101.enrollStudent("Bob");
        cs101.enrollStudent("Charlie");
        physics201.enrollStudent("Diana");
        
        // Test 2: Course capacity limit
        math101.enrollStudent("Eve"); // Should succeed (3rd student)
        math101.enrollStudent("Frank"); // Should go to waitlist (course full)
        
        // Test 3: Multiple courses filling up
        cs101.enrollStudent("Grace"); // Should succeed (2nd student)
        cs101.enrollStudent("Henry"); // Should go to waitlist (course full)
        
        // Test 4: Student already enrolled
        math101.enrollStudent("Alice"); // Should fail - already enrolled
        
        
        //Display current status
        math101.getCourseInfo();
        cs101.getCourseInfo();
        physics201.getCourseInfo();
        
        
        // Test 5: Waitlist functionality
        System.out.println("\n--- Testing Waitlist Functionality ---");
        cs101.dropStudent("Charlie"); // Should auto-enroll Henry from waitlist
        cs101.getCourseInfo();
        
        // Test 6: University statistics
        Course.getUniversityStats();
        
        // Test 7: Fill university capacity (simulation)
        System.out.println("\n--- Simulating University Capacity Limit ---");
        // Simulate filling the university
        int remainingCapacity = Course.UNIVERSITY_CAPACITY - Course.totalEnrolledStudents;
        for (int i = 0; i <= remainingCapacity; i++) {
            physics201.enrollStudent("Student" + i);
        }
        // This should fail due to university capacity
        math101.enrollStudent("Extra Student");
        
        // Final statistics
        Course.getUniversityStats();
        
        // Test 8: Display all courses final status
        System.out.println("\n--- FINAL COURSE STATUS ---");
        math101.getCourseInfo();
        cs101.getCourseInfo();
        physics201.getCourseInfo();
    
	}

}
