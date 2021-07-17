package recursion;
import java.util.*;
public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		reverse(str);
	}

	private static void reverse(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			return;
		}
		
		String ros = str.substring(1);
		
		reverse(ros);
		
		System.out.println(str.charAt(0));
		
		
	}

}
