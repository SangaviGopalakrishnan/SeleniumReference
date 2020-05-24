package code;

public class ReverseArrayInPlace {
	
	public static void main(String args[]) {
		
		char arr[]= {'a','c','d','d','f'};
		char temp;
		int length =arr.length;
		if(length < 2) {
			System.out.print(arr);
		}else {
			for(int i=0;i<length/2;i++) {
				temp=arr[i];
				arr[i]=arr[length-1-i];
				arr[length-1-i]=temp;
			}
			System.out.println(arr);
		}
			
	}

}
