package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Anagram";
		str = str.toLowerCase();
		char c = 'a';
		int count=0;
		for(int i=0;i< str.length();i++) {
			if(str.charAt(i)==c)
				count++;
		}
	System.out.println("Char occurence is of " +c+ " is "+count);

	}

}
