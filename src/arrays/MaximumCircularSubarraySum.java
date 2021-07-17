package arrays;
import java.util.*;

public class MaximumCircularSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int wrapsum = 0;
		int nonwrapsum = kadens(a,n);
		
		int totalsum = 0;
		for(int i=0;i<n;i++) {
			totalsum += a[i];
			a[i] = -a[i];
		}
		
		wrapsum = totalsum - (-kadens(a,n));
		
		System.out.println((Math.max(nonwrapsum, wrapsum)));
		
		
	}
	public static int kadens(int[] a,int n) {
		int currsum = 0;
		int maxsum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			currsum += a[i];
			if(currsum<0) {
				currsum=0;
			}
			maxsum = Math.max(maxsum, currsum);
		}
		
		return maxsum;
	}

}
