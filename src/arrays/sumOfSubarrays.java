package arrays;
import java.util.Scanner;

public class sumOfSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =  s.nextInt();
		}
		
		int sumcurr = 0;
		for(int i=0;i<n;i++) {
			sumcurr = 0;
			for(int j=i;j<n;j++) {
				sumcurr += a[j];
				System.out.println(sumcurr);
			}
		}
	}

}
