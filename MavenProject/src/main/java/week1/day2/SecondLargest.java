package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {2,3,5,6,11,16};
		Arrays.sort(data);
		System.out.println("Second Largest is "+data[data.length-2]);
	}

}
