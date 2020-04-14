package comdevmode;
// Java program to rotate an array by 
// d elements 

class RotateArray { 
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{ 
//		for (int i = 0; i < d; i++) {
//			leftRotatebyOne(arr, n); 
//		} 
//		leftRotatebyTwo(arr,0,d-1);
		leftRotatebyTwo(arr,d,n-1);
//		leftRotatebyTwo(arr,0,n-1);
	}	

	void leftRotatebyOne(int arr[], int n) 
	{ 
		int i, temp; 
		temp = arr[0]; 
		System.out.println(n-1 + " n ");
		for (i = 0; i < n - 1; i++) {
			System.out.print(i + "times ");
			arr[i] = arr[i + 1];
			System.out.println(arr[i] + "in ");
		}
		System.out.println(arr[i] + " out");
		System.out.println(i + "finaltimes ");
		arr[i] = temp; 
		System.out.println(arr[i] + " finalout");
	} 
	
	void leftRotatebyTwo(int arr[], int d, int n) {
		int i,temp;
		for(i=d;i<n;i++) {
			temp=arr[d];
			arr[d]=arr[n];
			arr[n]=temp;
			d++;
			n--;
		}
//		System.out.println(arr[d] + " out");
//		System.out.println(d + " index");
//		System.out.println(arr[d] + " finalout");
	}

	/* utility function to print an array */
	void printArray(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		RotateArray rotate = new RotateArray(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.leftRotate(arr, 4, 7); 
		rotate.printArray(arr, 7); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
