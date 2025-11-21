
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
	
	public static boolean hasUniveristyCapacity() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
