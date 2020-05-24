package code;

public class NoNotRepeated {
	
	public static void main(String args[]) {
//	1.No which occured only once
//		int arr[]= {1,2,3,1,2};
//		int res= arr[0];
//		for(int i=1;i<arr.length;i++) {
//			res=res^arr[i];
//		}
//		System.out.print(res);
		
//	2.First repeating element
		int arr[]= {10,2,1,1,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]);
					break;
				}
			}
		}
	}
	

}
