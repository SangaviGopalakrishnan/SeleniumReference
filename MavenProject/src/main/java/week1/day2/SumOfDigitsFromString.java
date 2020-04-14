package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="wjrg545werw5er4wer5489";
		char c[]=str.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				count=count+Character.getNumericValue(c[i]);
			}
		}
		System.out.println("Count is "+count);
	}

}
