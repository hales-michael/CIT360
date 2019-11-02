package collections;
import java.util.LinkedList;
import java.util.Queue;
public class queue {

	public static void main(String[] args) {
		
		Queue<String> lunchLine = new LinkedList<>();
		
		
		lunchLine.add("Quaid");
		lunchLine.add("Melina");
		lunchLine.add("Kuato");
		lunchLine.add("Cohaagen");
		lunchLine.add("Lori");
		lunchLine.add("Benny");
		
		System.out.println("Total Recall lunch line: " + lunchLine);
		
		try {
			String remove = lunchLine.remove();
			System.out.println("Now serving " + remove);
			System.out.println("Updated lunch line: " + lunchLine);
			
			
		}
		catch (Exception e) {
			
			System.out.println("Failed to remove first in line. \n");
		}
		
	}

}
