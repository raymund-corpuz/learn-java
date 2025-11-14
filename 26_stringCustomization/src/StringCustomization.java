
public class StringCustomization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hello");
		
		//Append a string
		sb.append(" World");
		System.out.println(sb); // Output: Hello World
		
		//Insert at a specific index
		sb.insert(6, "Java ");
		System.out.println(sb); // Output: Hello Java World
		
		//Delete a range of characters
		sb.delete(0, 6); // Deletes "Hello "
		System.out.println(sb); // Output: Java World
		
		//Reverse the string
		sb.reverse();
		System.out.println(sb); // Output: dlroW avaJ
		
		// Convert to String
		String finalString = sb.toString();
		System.out.println(finalString); // Output: dlroW avaJ

	}

}
