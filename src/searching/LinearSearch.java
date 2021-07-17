package searching;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		int k = 56;
		linear(a,k);
		
	}

	private static char[] linear(int[] a, int k) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			if(a[i] == k) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		return null;
	}

}
