package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153,rem,sum=0,temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
		}
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");
	}

}
