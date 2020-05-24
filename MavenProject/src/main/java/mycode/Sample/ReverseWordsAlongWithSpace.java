package code;

public class ReverseWordsAlongWithSpace {
	
	public static void main(String[] args) {
		
		String str="I am a String";
		char[] ch=str.toCharArray();
	    char[] ch1=new char[ch.length];
		
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[i]==' ') {
	    		ch1[i]=ch[i];
	    	}
		}
		
		int j=ch1.length-1;
		for(int z=0;z<ch.length;z++) {
			if(ch[z]!=' ') {
				if(ch1[j]==' ') {
					j--;
				}
					ch1[j]=ch[z];
					j--;
			}
		}
		System.out.print(ch1);
	}
	
	

}
