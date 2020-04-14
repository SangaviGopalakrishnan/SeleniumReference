package week3.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="PayPal India";
		char[] c = str.toCharArray(); 
		Set<Character> set = new LinkedHashSet<Character>();
		Set<Character> dupset = new LinkedHashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			//			if(set.contains(c[i])) {
			//				dupset.add(c[i]);
			//			}else
			//				set.add(c[i]);


			if(!set.add(c[i]))      // Alternative way
				dupset.add(c[i]);
		}
		set.removeAll(dupset);
		ArrayList<Character> list = new ArrayList<Character>(set);
		for (Character character : list) {
			if(character!=' ')
			System.out.print(character);
		}

	}

}
