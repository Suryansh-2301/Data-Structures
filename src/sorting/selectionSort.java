package sorting;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {45,67,34,21,34,99,78,76};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[j] < a[i]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
					
				}
			}
		}
		for(int x: a) {
			System.out.println(x);
		}
	}

}
