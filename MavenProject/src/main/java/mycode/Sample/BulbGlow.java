package comdevmode;

public class BulbGlow{
	
public static void main (String[] args) {
	boolean checkFlag;
	
//	int arr[] = { 3,2,1,5,4 }; 
//	int arr[] = {9,7,8,3,1,2};
	int arr[] = {10,8,3,2,7,15,13,14,1};
	
	for(int i = 0 ; i< arr.length ; i++ ) {
		checkFlag = false;
		for(int j=0; j<i;j++) {
			if((arr[i]+1) == arr[j]) {
				checkFlag = true;
			}
			
		}
		if(checkFlag) {
			System.out.print(arr[i] + "\n");
		}
	}
	
}













}






