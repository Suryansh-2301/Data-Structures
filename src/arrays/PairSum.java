package arrays;
import java.util.*;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		
		boolean ans = check(a,n,k);
		
		System.out.println(ans);

	}

	public static boolean check(int[] a,int n,int k) {
		int low = 0;
		int high = n-1;
		
		while(low<high) {
			if(a[low]+a[high] == k) {
				System.out.println(low + " " + high);
				return true;
			}else if(a[low]+a[high] > k) {
				high--;
			}else {
				low++;
			}
		}
		return false;
	}
}
