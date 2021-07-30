//Given a 2xn board and tiles of size 2x1
//Find number of ways to tile a given board



package recursion;


public class TilingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ways(4));
	}
	public static int ways(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return ways(n-1)+ways(n-2);
	}

}
