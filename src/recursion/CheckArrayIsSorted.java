package recursion;
import java.util.*;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		boolean ans = check(a,n);
		
		System.out.println(ans);
	}
	
	public static boolean check(int[] a,int n) {
		if(n==0 || n==1) {
			return true;
		}
		if(a[n-1] < a[n-2]) {
			return false;
		}
		return check(a,n-1);
	}

}
