package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam1",newstr=""; 
		for(int i=str.length()-1;i>=0;i--) {
			newstr=newstr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(newstr))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
