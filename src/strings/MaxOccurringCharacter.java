package strings;
import java.util.*;

public class MaxOccurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		char[] strarr = str.toCharArray();
		
		for(char c: strarr) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
		}
		
		for (Map.Entry entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}
