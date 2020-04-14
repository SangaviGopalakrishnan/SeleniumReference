package week4.day1;

import java.util.HashMap;
import java.util.Map;

public class OneCharOccurance {

	public static void main(String[] args) {
		String str = "hfuuytuytusudy"; 
		char ch = 'h';
		int count = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] c = str.toCharArray();
		for (char d : c) {
			if(d == ch)
				count++;
		}
		map.put(ch, count);
		System.out.println(map);
	}

}
