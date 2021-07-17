package arrays;
import java.util.*;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int a1[][] = new int[n1][n2];
		int a2[][] = new int[n2][n3];
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				a1[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n3;j++) {
				a2[i][j] = s.nextInt();
			}
		}
		
		int ans[][] = new int[n1][n3];
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n3;j++) {
				ans[i][j] = 0;
			}
		}
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n3;j++) {
				for(int k=0;k<n2;k++) {
					ans[i][j] += a1[i][k] * a2[k][j];
				}
			}
		}
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n3;j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
