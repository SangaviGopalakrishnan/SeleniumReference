package code;

import java.util.Arrays;

// Union and Intersection of array 
public class UnionArray {

	public static void main(String args[]) {
		int arr1[]= {1,3,4,5,6};
		int arr2[]= {9,10,11,3,2,1};

		int length1=arr1.length;
		int length2=arr2.length;
		
		int i=0,j=0;
		while(i<length1 && j<length2) {
			if(arr1[i]<arr2[j]){
				System.out.print(arr1[i++]+" ");
			}
			else if(arr2[j]<arr1[i]) {
				System.out.print(arr2[j++]+" ");
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
		while(i<length1) {
			System.out.print(arr1[i++]+" ");
		}
		while(j<length2) {
			System.out.print(arr2[j++]+" ");
		}
		 
//		Intersection of array
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i] == arr2[j]) {
//					System.out.print(arr2[j]+" ");
//				}
//			}
//		}
	}
}
