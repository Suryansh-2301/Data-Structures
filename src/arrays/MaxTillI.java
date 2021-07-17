package arrays;
import java.util.*;

public class MaxTillI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int mx = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			mx = Math.max(mx, a[i]);
			System.out.println(mx);
		}
	}

}
