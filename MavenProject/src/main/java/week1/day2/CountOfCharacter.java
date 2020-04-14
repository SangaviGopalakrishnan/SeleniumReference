package week1.day2;

public class CountOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Anagram";
		str = str.toLowerCase();
		for(int i=0;i<str.length();) {
			int count =1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			System.out.println("Count of "+str.charAt(i)+" is "+count);
			str =str.replace(Character.toString(str.charAt(i)), "");
		}

	}

}
