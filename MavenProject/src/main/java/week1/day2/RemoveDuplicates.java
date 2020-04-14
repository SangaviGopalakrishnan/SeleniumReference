package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaa bbb aaaa jjj aaaa rrrrr",dup="";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			if(dup.contains(words[i])) {
				continue;
			}else
				dup=(dup+words[i]).concat(" ");			    
		}
		System.out.println("After Duplicate removal "+dup);
	}

}
