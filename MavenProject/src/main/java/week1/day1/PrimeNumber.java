package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 9;
		boolean flag=false;
		if(no ==0 || no ==1) {
			System.out.println("Not a Prime Number");
		}else {
			for(int i=2;i<=no/2;i++) {
				if(no%i == 0) {
					flag=true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Prime Number");
			else
				System.out.println("Not a Prime Number");
		}

	}

}
