package recursion;
import java.util.*;

public class PrintNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Decreasing");
		dec(n);
		System.out.println("Increasing");
		inc(n);
	}
	
	public static void dec(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		dec(n-1);
	}
	
    public static void inc(int n) {
		if(n==0) {
			return;
		}
		
		inc(n-1);
		System.out.println(n);
	}

}
