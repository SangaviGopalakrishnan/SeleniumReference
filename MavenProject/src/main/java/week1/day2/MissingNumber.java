package week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {2,5,6,7};
		int length = data.length;
		Arrays.sort(data);
		if(length!=data[data.length-1])
			length=data[data.length-1];
		int k=0;
		for (int i = 0; i <length; i++) {
			while(k<length && k!=data[i]) {
				if(k==data[i]) {
					break;
				}else {
					System.out.println("Missing no is"+ k);
					k++;
				}
				
			}
			k++;
		}
	}

}
