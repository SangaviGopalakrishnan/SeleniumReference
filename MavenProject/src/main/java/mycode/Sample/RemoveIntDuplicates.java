
package code;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveIntDuplicates {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(7); 
		list.add(5);
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		set.addAll(list);
		list.clear();
		list.addAll(set);
	}
}
