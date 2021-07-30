package sorting;
import java.util.*;

public class QuickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		quickSort(a,0,n-1);
		print(a,n);
	}

	private static void print(int[] a,int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void quickSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int pi = partition(a,l,r);
			quickSort(a,l,pi-1);
			quickSort(a,pi+1,r);
		}
	}

	private static int partition(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		int pivot = a[r];
		int i = l-1;
		for(int j=l;j<r;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
