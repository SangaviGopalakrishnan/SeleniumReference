package code;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNoInIntArray {

	public static void main(String args[]) {
        int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = sc.nextInt();
		
		int arr[]=new int[length];
		
		System.out.println("Enter array elements");
		for(i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if((arr[i]) == arr[j]) {
					System.out.print("Duplicate Values" + arr[j]);
				}
			}
		}
	}
}
