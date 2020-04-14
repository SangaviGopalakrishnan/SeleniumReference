package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxlength=5,fact=1;
		if(maxlength>1) {
			for (int i = 1; i <=maxlength; i++) {
				fact=fact*i;
			}
			System.out.println("Factorial is "+fact);
		}else {
			System.out.println("Factorial is "+ 1);
		}
			
		
	}

}
