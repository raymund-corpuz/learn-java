
public class UnexpectedResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() started");
		count(1,10);
		System.out.println("main() complete");
	}

	
	public static void count(int start, int to) {
		System.out.println("count() started");
		while(start < to) {
			System.out.println(start);
			start++;
		}
		System.out.println("count() complete");
	}
}
