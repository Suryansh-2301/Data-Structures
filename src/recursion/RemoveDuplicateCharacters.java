package recursion;
import java.util.*;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		System.out.println(remove(str));
	}

//	private static String remove(String str) {
//		// TODO Auto-generated method stub
//		
//		if(str.length() == 0) {
//			return "";
//		}else if(str.lengt)
//		
//		String t = remove(str.substring(1));
//		if(str.charAt(0) == t.charAt(0)) {
//			return remove(str.substring(2));
//		}
//		
//		return str.charAt(0)+(str.substring(1));
//	}

	private static String remove(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			return "";
		}else if(str.length() == 1) {
			return str;
		}
		char ch = str.charAt(0);
		String ans = remove(str.substring(1));
		if(ch == ans.charAt(0)) {
			return ans;
		}
		return ch+ans;
		
	}
	
	

}
