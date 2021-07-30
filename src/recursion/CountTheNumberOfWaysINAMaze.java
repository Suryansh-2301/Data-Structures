package recursion;
import java.util.*;

public class CountTheNumberOfWaysINAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//size of maze
		int n = s.nextInt();
		
		System.out.println(ways(n,0,0));
	}
	
	static int ways(int n,int i,int j) {
		
		if(i == n-1 || j == n-1) {
			return 1;
		}
		if(i>=n || j>=n) {
			return 0;
		}
		
		return ways(n,i+1,j)+ways(n,i,j+1);
	}

}
