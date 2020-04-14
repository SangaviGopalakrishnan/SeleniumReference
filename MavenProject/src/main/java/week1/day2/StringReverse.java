package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello",newstr="";
		
	    for(int i=str.length()-1;i>=0;i--) {
	    	newstr=newstr+str.charAt(i);
	    }
	    System.out.println("String reverse is "+newstr);
	}

}
