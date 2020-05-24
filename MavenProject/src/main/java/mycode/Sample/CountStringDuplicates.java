package code;

import java.util.HashMap;
import java.util.*;

public class CountStringDuplicates {
	
	public static void main(String args[]) {
		
		String str = "sjfdjfskjdfhsdkjsdfsdf";
		char arr[] = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c : arr ) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set = map.entrySet(); 
		for(Map.Entry<Character, Integer> entr : set) {
			if(entr.getValue()>1) {
				System.out.println(entr.getKey()+ ":" + entr.getValue());
			}
		}
	}

}
