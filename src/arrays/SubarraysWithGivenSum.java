package arrays;
import java.util.*;

public class SubarraysWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int sum = s.nextInt();
		int n = s.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		int[] ans = sumsubarray(a,sum);
		
		for(int x: ans) {
			System.out.println(x + " ");
		}

	}

	public static int[] sumsubarray(int[] a,int sum) {
		int start = 0;
		int end = 1;
		
		int currsum = a[0];
		
		while(end <= a.length) {
			while(currsum>sum && start<end-1) {
				currsum -= a[start];
				start++;
			}
			
			if(currsum == sum){
				return new int[] {start,end-1};
			}else {
				currsum += a[end];
			}
			end++;
		}
		
		
		return new int[] {-1};
	}

}


//time complexity is O(n)
//space complexity isn O(1)
