package recursion;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int ans = fact(n);
		System.out.println("Factorial of "+n+" is "+ans);
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
//		int prevfact = fact(n-1);
		return n*fact(n-1);
		
	}

}
