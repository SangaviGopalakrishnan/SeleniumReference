package code;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String args[]) {

		System.out.println("Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(armstrong(n) == true) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}

	private static boolean armstrong(int n) {
		
		int r,sum=0,temp;
		
		temp = n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum= sum+(r*r*r);
		}
		if(temp == sum) {
			return true;
		}else {
			return false;
		}
	}

}
