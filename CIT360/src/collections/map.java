package collections;
import java.util.*;
import java.util.Map.Entry;

public class map {
	public static void main(String args[]) {
		HashMap<String,String> eqPres = new HashMap<String,String>();

		eqPres.put("President", "Brother Mann");
		eqPres.put("First Counselor", "Brother Sagers");
		eqPres.put("Second Counselor", "Brother Redd");
		eqPres.put("Secretary", "Brother Harp");
		eqPres.put("Assistant Secretary", "Brother Gillete");
		
		System.out.println("Current Elder's Quorum Presidency: \n");
		printMap(eqPres);
		

		

		System.out.println();
		System.out.println("Replacing Elder's Quorum with newly called members...\n");
		
		eqPres.replace("President", "Brother Anderson");
		eqPres.replace("First Counselor", "Brother Mataele");
		eqPres.replace("Second Counselor", "Brother Gardner");
		
		printMap(eqPres);

		
		}



	public static void printMap(HashMap<String, String> eqPres) {
		for (Iterator<Entry<String, String>> iterator = eqPres.entrySet().iterator(); 
				iterator.hasNext();) {
				Entry<String, String> m = iterator.next();

		System.out.println(m.getKey() + " -- " + m.getValue());

}
}
}