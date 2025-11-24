import java.util.Arrays;
import java.util.Date; 


//  ===== BASE CLASS =====
 class Person {

		// TODO Auto-generated constructor stub
		protected String name;
		protected int yearOfBirth;
		protected String address;
		
		//public getters and setters for all fields here
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name =  name;
		}
		
		public int getYearOfBirth() {
			return yearOfBirth;
		}
		
		public void setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
		}
		
		public String getAddress() {
			return address;
		}
	
		public void setAddress(String address) {
			this.address = address;
		}
}
	
//===== SUBCLASS: CLIENT =====
	class Client extends Person{
		protected String contactNumber;
		protected boolean gold;
		
		//public getters and setters for all fields here
		public String getContactNumber() {
			return contactNumber;
		}
		
		public void setContactNumber(String contactNumber) {
			this.contactNumber =  contactNumber;
		}
		
		public boolean isGold() {
			return gold;
		}
		
		public void setGold(boolean gold) {
			this.gold = gold;
		}
	}
	
	// ===== SUBCLASS: EMPLOYEE =====
	class Employee extends Person{
		protected Date startDate;
		protected Long salary;
		
		//public getters and setters for all fields here
		
		public Date getStartDate() {
			return startDate;
		}
		
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		
		public Long getSalary() {
			return salary;
		}
		
		public void setSalary(Long salary) {
			this.salary = salary;
		}
	}

	// ===== SUBCLASS OF EMPLOYEE: PROGRAMMER =====
	class Programmer extends Employee{
		protected String[] programmingLanguages;
		
		public String[] getProgrammingLanguages() {
			return programmingLanguages;
		}
		
		public void setProgrammingLanguages(String[] programmingLanguages) {
			this.programmingLanguages =  programmingLanguages;
		}
	}

	// ===== SUBCLASS OF EMPLOYEE: MANAGER =====
	class Manager extends Employee{
		protected boolean smile;
		
		public boolean isSmile() {
			return smile;
		}
		
		public void setSmile(boolean smile) {
			this.smile = smile;
		}
	}
	
	
	// ==== MAIN TEST CLASS
	public class Main {
		public static void main(String[] args) {
			
			Programmer p = new Programmer();
			
			//inherited setters
			p.setName("John Elephant");
			p.setYearOfBirth(1985);
			p.setAddress("Some street, 15");
			p.setStartDate(new Date());
			p.setSalary(500_000L);
			
			//own setter
			p.setProgrammingLanguages(new String[] {"Java", "Scala", "Kotlin"});
			
			//reading inherited fields
			System.out.println(p.getName());
			System.out.println(p.getSalary());
			
			
			//reading array field
			System.out.println(Arrays.toString(p.getProgrammingLanguages()));
			
			
		}
	}
	


