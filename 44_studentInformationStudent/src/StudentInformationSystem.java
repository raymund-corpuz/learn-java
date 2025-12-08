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
	// CREATE STUDENT
	// =============================
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Successfully added new Student: " + student.getStudentName());
	}
	// =============================
	// READ STUDENT
	// =============================
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
	// UPDATE STUDENT
	// =============================
	public void updateStudent(String name, String year, String address) {
		for(Student student: students) {
			if(student.getStudentName().equals(name)) {
				student.setStudentYear(year);
				student.setStudentAddress(address);
				System.out.println("Updated Successfully: " + student.getStudentName());
			}
		}
		System.out.println("Student: " + name + " not found.");
	}
	// =============================
	// DELETE STUDENT
	// =============================
	public void removeStudent(String name) {
		for(Student student: students) {
			if(student.getStudentName().equals(name)) {
				students.remove(student);
				System.out.println("Student: "+ name + " removed successfully.");
			}
		}
		System.out.println("Student: " + name + " not found.");
	}
	

	// =============================
	// CREATE COURSE
	// =============================
	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("Successfully added new Course: " + course.getCourseName());
	}
	
	// =============================
	// READ COURSE
	// =============================
	public void listOfCourse() {
		if(courses.isEmpty()) {
			System.out.println("NO COURSE FOUND!");
			return;
		}
		System.out.println(" ==== LIST OF COURSES ====");
		for(Course course: courses) {
			System.out.println("Course Name: " + course.getCourseName() + " , Course Teacher: " +course.getCourseTeacher());
		}
	}
	
	// =============================
	// UPDATE COURSE
	// =============================
	public void updateCourse(String courseName, String teacher ) {
		for(Course course: courses) {
			if(course.getCourseName().equals(courseName)) {
				course.setCourseTeacher(teacher);
			}
		}
	}
	
	// =============================
	// DELETE COURSE
	// =============================
	public void removeCourse(String courseName) {
		if(courses.isEmpty()) {
			System.out.println("Courses not found");
			return;
		}
		for(Course course: courses) {
			if(course.getCourseName().equals(courseName)) {
				courses.remove(course);
				System.out.println("Course: " + course.getCourseName()+ ", deleted successfully");
			}
		}
	}
}
