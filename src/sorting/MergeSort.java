package sorting;
import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		mergeSort(a,0,a.length-1);
		print(a);
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void mergeSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l>=r) {
			return;
		}
		int mid = (l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,mid,r);
		
	}

	private static void merge(int[] a, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l,j=mid+1,k=l;
		int[] temp = new int[a.length];
		
		while(i<=mid && j<=r) {
			if(a[i]<a[j]) {
				temp[k] = a[i];
				i++;
				k++;
			}else {
				temp[k] = a[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			temp[k++] = a[i++];
		}
		while(j<=r) {
			temp[k++] = a[j++];
		}
		for(i=l;i<=r;i++) {
			a[i] = temp[i];
		}
		
	}
	//Tome complexity : O(nlogn)
	//Space Complexity : O(n)

}
