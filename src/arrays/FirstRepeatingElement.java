package arrays;
import java.util.*;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		final double N = Math.pow(10, 6);
		
		int idx[] = new int[(int) N];
		
		for(int i=0;i<N;i++) {
			idx[i] = -1;
		}
		
		int minidx = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(idx[a[i]] != -1) {
				minidx = Math.min(minidx, idx[a[i]]);
			}else {
				idx[a[i]] = i;
			}
		}
		
		if(minidx == -1) {
			System.out.println(-1);
		}else {
			System.out.println(a[minidx]);
		}
		
	}

}
