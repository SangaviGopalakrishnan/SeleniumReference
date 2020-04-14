package week3.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortingUsingCollection {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"hcl","wipro","aspire systems","cts"};
		int length = arr.length;
		Arrays.sort(arr);		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
