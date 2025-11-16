import java.util.Scanner;


public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m =  sc.nextInt();
		
		int[][] A = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int[][] B = new int[m][n]; // rotate matrix
		
		//rotate 90 degrees clockwise
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				B[i][j] = A[n - 1 - j][i];
			}
		}
		
		//print result
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println(B[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
