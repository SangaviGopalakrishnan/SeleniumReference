/**
 * 
 */
package comdevmode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 * @author HP
 *
 */
public class DiceFunction {
	
	public static void getValue(Integer State, Integer Check, List<Integer> list) {
		
		  Map<String,Integer> m = new HashMap<String,Integer>();
		  Random rand = new Random();
		  
		  if(State != 1 ) {
		  int player1 = rand.nextInt(7);
		  m.put("player1", player1);
		  }
		  int player2 = rand.nextInt(7);
		  m.put("player2", player2);
		  int player3 = rand.nextInt(7);
		  m.put("player3", player3);
		  int player4 =  rand.nextInt(7);
		  m.put("player4", player4);
		  System.out.println(m);
		  for (Entry<String, Integer> entry : m.entrySet()) {
			  //System.out.println(entry.getKey());
			  //System.out.println(entry.getValue());
			  if(entry.getValue() == 1) {
				  System.out.println(entry.getKey() + "has won the game");
				  String output = entry.getKey();
				  String outputOne = output.substring(6, 7);
				  State = Integer.valueOf(outputOne);
				  Check = entry.getValue();
				  list.add(entry.getValue());
			  }
		  }
		  if(Check == 1) {
			  getValue(State,Check,list);
		  }
		  if(State == 0) {
			  getValue(State,Check,list);
		  }
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer State = 0;
		  Integer Check = 0;
		  List <Integer> list = new ArrayList<Integer>();
		  getValue(State,Check,list);
		  
	}

}
