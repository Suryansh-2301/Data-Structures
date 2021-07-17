package recursion;
import java.util.*;

public class FirstAndLastOccurrenceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int key = s.nextInt();
		
		int f = firocc(a,n-1,key);
		System.out.println(f);
		int l = lasocc(a,n,0,key);
		System.out.println(l);
		
	}

	private static int lasocc(int[] a, int n,int i, int key) {
		// TODO Auto-generated method stub
		if(i==n) {
			return -1;
		}
		int restarray = lasocc(a,n,i+1,key);
		if(a[i] == key) {
			return i;
		}
		return -1;
	}

	private static int firocc(int[] a, int n, int key) {
		// TODO Auto-generated method stub
		if(n<0) {
			return -1;
		}
		if(a[n] == key) {
			return n;
		}
		return firocc(a,n-1,key);
	}

}
