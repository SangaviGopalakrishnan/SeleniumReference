package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 654,sum=0,rem;
		while(value>0) {
			rem=value%10;
			sum=sum+rem;
			value=value/10;
		}
		System.out.println("Sum is "+ sum);
	}

}
