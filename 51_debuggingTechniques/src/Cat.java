
public class Cat {
	String name;
	int age;
	public Cat(String name, int age) {
		assert( age >= 0) :"Invalid age";
		this.name = name;
		this.age = age;
	}
}
