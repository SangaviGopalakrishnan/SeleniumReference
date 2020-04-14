package comdevmode;

class MergeTwoArray{

public static void main(String[] args){

MergeTwoArray merge =  new MergeTwoArray();
//int [] arr1 = {2,-1,7,-1,-1,10,-1};
//int [] arr2 = {5,8,12,14};
int [] arr1 = {2, 8, -1, -1, -1, 13, -1, 15, 20};
int [] arr2 = {5, 7, 9, 25};
int len1 = arr2.length;
int len2 = arr1.length-len1;
merge.moveToEnd(arr1,len1+len2);
merge.MergeIntoSingleArray(arr1,arr2,len1,len2);
merge.printArray(arr1,len1+len2);
}


void moveToEnd(int[] arr1,int len1){
int i, j = len1 - 1; 
        for (i = len1 - 1; i >= 0; i--)  
        { 
            if (arr1[i] != -1)  
            { 
                arr1[j] = arr1[i]; 
                j--; 
            } 
        } 

}

void MergeIntoSingleArray(int[] arr1,int[] arr2,int len1,int len2){
 int i = len2; 
          
        /* Current index of i/p part of mPlusN[]*/
        int j = 0; 
          
        /* Current index of N[]*/
        int k = 0; 
          
        /* Current index of of output mPlusN[]*/
        while (k < (len1))  
        { 
            /* Take an element from mPlusN[] if 
            a) value of the picked element is smaller and we have 
                not reached end of it 
            b) We have reached end of N[] */
            if ((i < (len1) && arr1[i] <= arr2[j]) || (j == len2))  
            { 
                arr1[k] = arr1[i]; 
                k++; 
                i++; 
            }  
            else // Otherwise take element from N[] 
            { 
                arr1[k] = arr2[j]; 
                k++; 
                j++; 
            } 
        } 
System.out.print( arr1[i] + " ");
}



void printArray(int[] arr1, int length){

for(int i=0;i<length;i++){
System.out.print(arr1[i] + " ");
}
 System.out.println(""); 
}

}

