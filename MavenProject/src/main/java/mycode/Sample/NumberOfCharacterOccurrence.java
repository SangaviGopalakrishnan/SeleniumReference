package comdevmode;

import java.util.Scanner;

public class NumberOfCharacterOccurrence{
	
public static void main (String[] args) {
	
	//Using replace
	
//  System.out.print("Enter the sentence"+ "\n");
//  Scanner sc = new Scanner(System.in);
//String a = sc.next();  
//int firstLength = a.length();
//System.out.println("Enter the character to be counted"+ "\n");
//String b = sc.next(); 
//String c = a.replace(b,"");
//int secondLength = c.length();
//System.out.print(c);
//System.out.println(firstLength - secondLength);
	
	//***************
	
	//Using for loop
	
	int count=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter sentence");
	String sen = scan.next();
	System.out.println("Enter word to be replaced");
	String word = scan.next();
	for(int i=0;i<sen.length();i++) {
		if((sen.charAt(i)) == word.charAt(0) ) {			
			count++;
		}
	}
	System.out.println(count);


}

}






