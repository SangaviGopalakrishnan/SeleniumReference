package code;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String args[]) {

	System.out.println("Enter word");
	Scanner sc = new Scanner(System.in);
	String n = sc.nextLine();
	String br = new StringBuilder(n).reverse().toString();
	
		System.out.println("Reverse is \n"+ br);
}
	
	

}
