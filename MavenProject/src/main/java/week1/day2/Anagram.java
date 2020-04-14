package week1.day2;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde",str2="edca",temp="";
		for(int i=str1.length()-1;i>=0;i--) {
	    	temp=temp+str1.charAt(i);
	    }
		if(temp.equals(str2))
			System.out.println("Given strings are anagram");
		else
			System.out.println("Given strings are not anagrams");
	}

}
