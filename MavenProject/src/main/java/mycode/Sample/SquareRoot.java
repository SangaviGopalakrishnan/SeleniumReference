package code;

public class SquareRoot {
	
	public static void main(String args[]) {
		
		int n = 64;
		
		for(int i=1;i<=n;i++) {
			
			int r = n%i;
			if(r == 0 && (n/i)==i) {
				System.out.print(i);
			}
		}
	}

}
