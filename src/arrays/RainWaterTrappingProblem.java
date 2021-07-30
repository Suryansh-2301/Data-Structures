package arrays;
import java.util.*;

public class RainWaterTrappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int[] left = new int[n];
		int[] right = new int[n];
		
		left[0] = a[0];
		for(int i=1;i<n;i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		
		right[n-1] = a[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			ans += (Math.min(left[i], right[i]) - a[i]);
		}
		
		System.out.println("Total Water trapped is " + ans + " unit.");
	}

}
