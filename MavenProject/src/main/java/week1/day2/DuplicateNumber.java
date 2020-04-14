package week1.day2;

import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {5,6,8,7,7,9,9};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			if(data.length!=i+1) {
				if(data[i]==data[i+1]) {
					System.out.println("Duplicate is "+data[i]);
				}
			}
		}
	}

}
