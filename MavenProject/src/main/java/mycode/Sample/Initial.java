/**
 * 
 */
package comdevmode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HP
 *
 */
public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> arrayList = new ArrayList<String>();
		    arrayList.add("A");//1
		    arrayList.add("B");//2
		    arrayList.add("C");//3
		    arrayList.add("D");//4
		    arrayList.add("E");//5
		    arrayList.add("F");//6
		    arrayList.add("G");//7
		    arrayList.add("H");//8
		    arrayList.add("I");//9
		    arrayList.add("J");//10
		    arrayList.add("K");//11
		    arrayList.add("L");//12
		    arrayList.add("M");//13
		    arrayList.add("N");//14
		    arrayList.add("O");//15
		    arrayList.add("P");//16
		    arrayList.add("X");//1
       System.out.println(arrayList.size());
       
       int start = (int) Math.ceil(arrayList.size()/4);
       
       System.out.println(start);
       
       for(int i=0;i<arrayList.size();i+=start) {
    	   int end = Math.min(i + start, arrayList.size());
           List<String> sublist = arrayList.subList(start, end);
//           List<String> sublist = arrayList.subList(start, end);
//           System.arraycopy(arrayList, start, sublist, 0, arrayList.size());
           System.out.println(sublist);
       }
	}

}
