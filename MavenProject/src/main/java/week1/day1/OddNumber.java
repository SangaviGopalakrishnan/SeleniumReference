package week1.day1;

public class OddNumber {

	public static void main(String[] args) {
		int maxlength=12;
		for (int i = 0; i <=maxlength; i++) {
			if(i%2 == 0)
				System.out.println(i +" is Even Number");
			else
				System.out.println(i +" is Odd Number");
		}
	}
}
