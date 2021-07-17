package sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {45,67,34,21,34,99,78,76};
		
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		for(int x: a) {
			System.out.println(x);;
		}
	}

}
