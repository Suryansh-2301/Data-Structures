package arrays;
import java.util.Scanner;

public class Spiral2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] a = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		int row_start = 0;
		int col_start = 0;
		int row_end = n-1;
		int col_end = m-1;
		
		while(row_start<=row_end && col_start<=col_end) {
			//for row start
			for(int col=col_start;col<=col_end;col++) {
				System.out.println(a[row_start][col] + " ");
			}
			row_start++;
			
			//for col end
			for(int row=row_start;row<=row_end;row++) {
				System.out.println(a[row][col_end] + " ");
			}
			col_end--;
			
			//for row end
			for(int col=col_end;col>=col_start;col--) {
				System.out.println(a[row_end][col] + " ");
			}
			row_end--;
			
			//for col start
			for(int row=row_end;row>=row_start;row--) {
				System.out.println(a[row][col_start] + " ");
			}
			col_start++;
		}

	}

}
