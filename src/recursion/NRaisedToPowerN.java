package recursion;
import java.util.*;

public class NRaisedToPowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int p = s.nextInt();
		
		int ans = calculate(n,p);
		System.out.println(ans);
	}

	private static int calculate(int n, int p) {
		// TODO Auto-generated method stub
		if(p == 0) {
			return 1;
		}
		int ans = calculate(n,p-1);
		return n*ans;
	}

}
