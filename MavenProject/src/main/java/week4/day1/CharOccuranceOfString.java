package week4.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccuranceOfString {

	public static void main(String[] args) {
		String str = "Most Important"; 
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] arr = str.toCharArray();
		for (char d : arr) {
			if(map.containsKey(d))
				map.put(d, map.get(d)+1);
			else
				map.put(d, 1);
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey() +"--->"+ entry.getValue());
		}
//		System.out.println(map);
	}

}
