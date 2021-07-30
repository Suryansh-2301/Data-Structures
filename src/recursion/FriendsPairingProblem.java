//Find the number of ways in which n friends can remain single 
//or can be paired up

package recursion;
import java.util.Scanner;

public class FriendsPairingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(pair(n));
	}

	private static int pair(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n == 1 || n == 2) {
			return n;
		}
		//n-1 if left single
		//n-2 if paired and multiplied bcz ways nth can be paired is n-1
		return pair(n-1) + pair(n-2)*(n-1);
	}

}
