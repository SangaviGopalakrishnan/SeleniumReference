package code;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {

		System.out.println("Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			System.out.println("Factorial is"+ factorial(n));
	}

	private static int factorial(int n) {
		if(n== 0){
			return 1;
		}else {
			return n*factorial(n-1);
		}
		// TODO Auto-generated method stub
	}

}
