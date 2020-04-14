package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=-1,b=1,num=8,c;
		for(int i=0;i<=num;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
