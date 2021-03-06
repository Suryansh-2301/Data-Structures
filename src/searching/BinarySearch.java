package searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
		
		if(r>=l) {
			int mid = l + (r-1)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x) {
				return binarySearch(arr,0,mid-1,x);
			}
			return binarySearch(arr,mid+1,r,x);
		}
		return -1;
	}

}
