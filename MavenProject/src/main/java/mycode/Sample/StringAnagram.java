package code;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	
	public static void main(String args[]) {
		
		System.out.println("Enter first string");
		Scanner sc = new Scanner(System.in);
		String string1=sc.nextLine();;
		System.out.println("Enter second string");
		String string2=sc.nextLine();  
		char a[]=string1.toCharArray();
		char b[]=string2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		
	}

}
