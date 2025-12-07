import java.util.ArrayList;

public class StudentInformationSystem {
	
	private ArrayList<Student> students;
	private ArrayList<Course> courses;

	public StudentInformationSystem() {
		this.students = new ArrayList<>();
		this.courses = new ArrayList<>();
	}
	
	// =============================
	// FIND STUDENT
	// =============================
	public Student findStudentByName(String studentName) {
		for(Student student: students) {
			if(student.getStudentName().equals(studentName)) {
				return student;
			}
		}
		return null;
	}
	// =============================
	// FIND COURSE
	// =============================
	public Course findCourseName(String courseName) {
		for(Course course: courses) {
			if(course.getCourseName().equals(courseName)) {
				return course;
			}
		}
		return null;
	}
	
	// =============================
	// ADD STUDENT
	// =============================
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Successfully added new Student: " + student.getStudentName());
	}
	
	public void listOfStudents() {
		if(students.isEmpty()) {
			System.out.println("No Students Found!");
			return;
		}
		
		System.out.println(" ==== LIST OF STUDENTS ==== ");
		for(Student student: students) {
			System.out.println("Student Name: " +student.getStudentName());
		}
	}

	// =============================
	// ADD COURSE
	// =============================
	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("Successfully added new Course: " + course.getCourseName());
	}
	
}
