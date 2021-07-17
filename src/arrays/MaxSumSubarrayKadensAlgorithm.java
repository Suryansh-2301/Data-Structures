package arrays;
import java.util.*;

public class MaxSumSubarrayKadensAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int currsum=0;
		int maxsum=0;
		
		for(int i=0;i<n;i++) {
			currsum += a[i];
			if(currsum > maxsum) {
				maxsum = currsum;
			}else if(currsum < 0) {
				currsum = 0;
			}
		}
		System.out.println(maxsum);
	}

}


//Time complexity: O(n)
//Space Complexity: O(1)