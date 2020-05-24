package code;
// Java program to find  
// element that appears once 
import java.io.*; 
import java.util.*; 
  
public class cc  
{ 
  
    // function which find number 
    static int singleNumber(int[] nums, int n) 
    { 
        HashMap<Integer, Integer> m = new HashMap<>(); 
        long sum1 = 0, sum2 = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (!m.containsKey(nums[i])) 
            { 
                sum1 += nums[i]; 
                m.put(nums[i], 1); 
            } 
            sum2 += nums[i]; 
        } 
  
        // applying the formula. 
        return (int)(2 * (sum1) - sum2);  
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int[] a = {1,2,3,1,2,4}; 
        int n = 6; 
        System.out.println(singleNumber(a,n)); 
  
    } 
}