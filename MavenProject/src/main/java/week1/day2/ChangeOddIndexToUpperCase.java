package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jdgajdgajsdgaj",str1="";
		for(int i=0;i<str.length();i++) {
			if(i%2==1) {
				str1=str1+Character.toString(str.charAt(i)).toUpperCase();
			}
			else
				str1=str1+Character.toString(str.charAt(i)).toLowerCase();
		}
		System.out.println("Converted string is "+str1);
	}

}
