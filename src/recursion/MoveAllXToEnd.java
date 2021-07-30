package recursion;
import java.util.*;

public class MoveAllXToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		System.out.println(move(str));
	}

	private static String move(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			return "";
		}else if(str.length() == 1) {
			return str;
		}
		
		char ch = str.charAt(0);
		String ans = move(str.substring(1));
		
		if(ch == 'X' || ch=='x') {
			return ans+ch;
		}
		return ch+ans;
	}

}
