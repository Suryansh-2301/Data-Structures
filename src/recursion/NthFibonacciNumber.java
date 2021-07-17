package recursion;
import java.util.*;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int ans = find(n);
		System.out.println(ans);
	}
	
	public static int find(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return find(n-1)+find(n-2);
	}

}
