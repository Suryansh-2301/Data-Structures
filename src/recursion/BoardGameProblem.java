package recursion;
import java.util.Scanner;

public class BoardGameProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		
		System.out.println(noOfWays(start,end));
	}

	private static int noOfWays(int start, int end) {
		// TODO Auto-generated method stub
		if(start == end)
			return 1;
		if(start > end)
			return 0;
		
		int count = 0;
		//i is for the numbers on the dice
		for(int i=1;i<=6;i++){
			count += noOfWays(start+i,end);
		}
		
		return count;
	}

}
