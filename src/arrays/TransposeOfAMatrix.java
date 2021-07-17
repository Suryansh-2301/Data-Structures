package arrays;
import java.util.*;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int a[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		//calculating transpose
		for(int i=0;i<n;i++) {
			//j=i so that we can only access upper triangle of matrix
			for(int j=i;j<n;j++) {
				//swapping the elements
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		//printing traspose of the matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
