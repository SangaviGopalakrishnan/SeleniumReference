package code;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		
		String b = "";
		String a = "This is a Sentence";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}
