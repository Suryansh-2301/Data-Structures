package arrays;
import java.util.*;

public class SumOfLongestArithmeticSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =  s.nextInt();
		}
		
		int ans = 2;
		int pd = a[1]-a[0];
		int currlength = 2;
		int j = 2;
		while(j<n) {
			if(pd == (a[j]-a[j-1])) {
				currlength++;
			}else {
				pd = a[j] - a[j-1];
			}
			ans = Math.max(ans, currlength);
			j++;
		}
		System.out.println(ans);
	}

}
