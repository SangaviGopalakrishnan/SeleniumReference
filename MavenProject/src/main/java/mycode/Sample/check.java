package comdevmode;
public class check{
	
public static void main (String[] args) {
  String arr="32154";
  char[] b = arr.toCharArray();
  String temp = "";
  
  for(int i=1;i < arr.length();i++) {
	  temp = arr.substring(0,i);{
//		  System.out.println(temp);
		  if(temp.contains(String.valueOf(Integer.valueOf(String.valueOf(b[i]))+1))) {
			  System.out.println(b[i]);
		  }
	  }
	  
  }
  
  
}












}






