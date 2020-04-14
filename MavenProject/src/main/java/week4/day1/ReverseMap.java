package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReverseMap {

	public static void main(String[] args) {
		
//		1.Approach
//		Map<Integer,String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
//		 map.put(100, "Hari");
//		 map.put(101, "Naveen");
//		 map.put(104, "Sam");
//		 map.put(103, "Balaji");
//		 Set<Entry<Integer, String>> entrySet = map.entrySet();
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey()+"--->"+entry.getValue());
//		}
		
		
		Map<Integer,String> map = new TreeMap<Integer, String>();
		 map.put(100, "Hari");
		 map.put(101, "Naveen");
		 map.put(104, "Sam");
		 map.put(103, "Balaji");
		 ArrayList<Integer> arr = new ArrayList<Integer>(map.keySet());
		 for (int i = arr.size()-1; i >=0; i--) {
			System.out.println(arr.get(i)+"--->"+map.get(arr.get(i)));
		}
		 
	}

}
