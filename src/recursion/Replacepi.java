package recursion;
import java.util.*;

public class Replacepi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		String ans = replacepi(str);
		
		System.out.println(ans);
	}
	
	static String ss=" ";
	private static String replacepi(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			return null;
		}
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			ss += 3.14;
			replacepi(str.substring(2));
		}else {
			ss += str.charAt(0);
			replacepi(str.substring(1));
		}
		return ss;
	}

}
