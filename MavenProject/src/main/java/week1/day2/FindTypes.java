package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str ="@#!$%^@ kjhfwjkehrewk 5465798";
		 int letter=0,space =0, num=0,sc =0;
		 char c[]=str.toCharArray();
		 for(int i=0;i<c.length;i++) {
			 if(Character.isDigit(c[i]))
				 num++;
			 else if(Character.isLetter(c[i]))
				 letter++;
			 else if(Character.isSpaceChar(c[i]))
				 space++;
			 else
				 sc++;
		 }
		 System.out.println("Digit is "+num);
		 System.out.println("Letter is "+letter);
		 System.out.println("Space is "+space);
		 System.out.println("Special Char is "+sc);
	}

}
