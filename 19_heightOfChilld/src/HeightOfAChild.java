import java.util.Scanner;

public class HeightOfAChild {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int h3 = sc.nextInt();
		
		boolean descOrdered = (h1 >= h2) && (h2 >= h3);
		
		System.out.println(descOrdered);
		
		sc.close();
	}
}
