//Given a matrix search the element in the matrix given that rows and columns of the given matric are sorted in ascending order


package arrays;
import java.util.*;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int ele = s.nextInt();
		
		int mat[][] = new int[n1][n2];
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				mat[i][j] = s.nextInt();
			}
		}
		
		int r=0,c=n2-1;
		boolean found = false;
		while(r<n1 && c>=0) {
			if(mat[r][c] == ele)
				found = true;
			if(mat[r][c] > ele) {
				c--;
			}else {
				r++;
			}
		}
		if(found) {
			System.out.println("Element found successfully");
		}else {
			System.out.println("No such Element");
		}
	}

}
