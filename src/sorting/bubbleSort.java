package sorting;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {45,67,34,21,34,99,78,76};
		boolean swapped;
		for(int i=0;i<a.length-1;i++) {
			swapped = false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		for(int x: a) {
			System.out.println(x);
		}
	}

}
