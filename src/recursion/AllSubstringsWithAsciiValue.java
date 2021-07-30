package recursion;
import java.util.*;

public class AllSubstringsWithAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		list(str,"");
	}

	private static void list(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		int val = ch;
		String ros = str.substring(1);
		
		list(ros,ans);
		list(ros,ans+ch);
		list(ros,ans+Integer.toString(val));
	}

}
