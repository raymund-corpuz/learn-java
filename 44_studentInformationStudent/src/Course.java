
public class Course {
	
	private static int nextId =1;
	private int courseId;
	private String courseName;
	private String courseTeacher;
	
	public Course(String course, String teacher) {
		this.courseId = nextId++;
		this.courseName = course;
		this.courseTeacher = teacher;
	}

	public int getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseTeacher() {
		return courseTeacher;
	}
	
	public void setCourseName(String course) {
		this.courseName = course;
	}
	
	public void setCourseTeacher(String teacher) {
		this.courseTeacher = teacher;
	}
	
}
