package code;

import java.util.Arrays;
import java.util.Scanner;

//Program to print missing no in Int array
public class MissingNoInIntArray {

	public static void main(String[] Args) {

		int i,actualsum=0,totalsum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = sc.nextInt();

		int arr[]=new int[length];

		System.out.println("Enter array elements");
		for(i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<arr.length-1;i++) {
			actualsum+=arr[i];
		}
		for(i=0;i<=length;i++) {
			totalsum+=i;
		}
		i =totalsum - actualsum;
		System.out.println("Missing value is " + i);
	}
//	public static void main(String[] Args) {
//
//		int i,n,totalsum=0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array length");
//		int length = sc.nextInt();
//
//		int arr[]=new int[length];
//
//		System.out.println("Enter array elements");
//		for(i=0;i<length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		n= length+1;
//		int sum=n*(n+1)/2;
//		for(i=0;i<arr.length;i++) {
//			totalsum+=arr[i];		
//		}
//		System.out.print(sum - totalsum);
//
//	}

}
