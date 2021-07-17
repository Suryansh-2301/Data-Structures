package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int a[]){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
		for(int i=0;i<a.length;i++) {
			if(mp.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			mp.put(a[i], true);
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,5,3,8,2};
		ArrayList<Integer> output = removeDuplicates(a);
		for(int i=0;i<output.size();i++) {
			System.out.println(output.get(i));
		}
	}

}
