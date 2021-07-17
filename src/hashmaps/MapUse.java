package hashmaps;

import java.util.*;



public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		
		//insert
		map.put("abc", 1);
		map.put("def", 2);
		
		//check presence
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		
		//its complexity is high
		if(map.containsValue(2)) {
			System.out.println("Has value");
		}
		
		//get value
		int v = 0;
		if(map.containsKey("abc1")) {
			v = map.get("abc");
		}
		System.out.println(v);
		
		//remove
		int s = map.remove("def");
		System.out.println(s);
		
		//size
		System.out.println("size: " + map.size());
		
		//iterate
		//function keyset returns keys but int form of sets
		Set<String> keys = map.keySet();
		for(String str : keys) {
			System.out.println(str);
		}
	}

}
