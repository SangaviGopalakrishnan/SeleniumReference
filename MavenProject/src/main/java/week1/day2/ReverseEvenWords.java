package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="bsf asdmaj sdbdajf asdjasjd asdasjdj adjwj",reverse="";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				String words=arr[i];
				for(int j=words.length()-1;j>=0;j--) {
					reverse=reverse+words.charAt(j);
				}
			}else {
				reverse=reverse+arr[i];
			}
			reverse=reverse.concat(" ");
		}
		System.out.println("Reversed string "+reverse);
	}

}
