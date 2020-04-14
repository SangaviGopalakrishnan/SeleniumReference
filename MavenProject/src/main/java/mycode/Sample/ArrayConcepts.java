/**
 * 
 */
package comdevmode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class ArrayConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
//		int newarr [] = new int [15];
//		System.out.println(arr.length);
//		System.arraycopy(arr, 3, newarr, 0,4);

		//Copy an array to an new array
		//  method -1: 
		//        System.out.println(Arrays.toString(newarr));
		// method-2: since array doesnot override toString method 
		//        for(int i=0;i<arr.length;i++) {
		//        	System.out.println(newarr[i]);
		//        }   	

		//Reverse an array
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		//Rotate a array by 2 positions from right
		int count;
//		Scanner scan = new Scanner(System.in);
		count=2;
		int l = arr.length;
		for(int i=0;i<count;i++) {
			int j,first = arr[l-1];
			for(j=l-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=first;
		}
		System.out.println(Arrays.toString(arr));
		
		//Rotate a array by 2 positions from left
		
//		count=2;
//		int l = arr.length;
//		for(int i=0;i<count;i++) {
//			int j,first = arr[0];
//			for(j=0;j<l-1;j++) {
//				arr[j]=arr[j+1];
//			}
//			arr[j]=first;
//		}
//		System.out.println(Arrays.toString(arr));
		

	}
}