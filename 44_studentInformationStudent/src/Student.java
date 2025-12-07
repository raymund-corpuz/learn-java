import java.util.UUID;

public class Student {
	
	UUID uuid = UUID.randomUUID();

	private String studentId;
	private String studentName;
	private String studentYear;
	private String studentAddress;
	
	public Student(String name, String year, String address) {
		// TODO Auto-generated constructor stub
		this.studentId = uuid.toString();
		this.studentName = name;
		this.studentYear = year;
		this.studentAddress = address;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentYear() {
		return studentYear;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setStudentYear(String year) {
		this.studentYear = year;
	}
	
	public void setStudentAddress(String address) {
		this.studentAddress = address;
	}
}
