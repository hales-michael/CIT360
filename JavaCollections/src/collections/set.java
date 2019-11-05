package collections;
import java.util.*;


public class set {
	
	public static void main(String args[]) {
	
	// Initialize and load array with values
	String names[] = {"Michael", "Daniel", "Jimmy", "Jill", "Aaron", "Emilee"}; 
	Set<String> halesFamily = new HashSet<String>();
	
	try {
		
		// Load values from array into set
		for (int i = 0; i < 6; i++) {
			halesFamily.add(names[i]);
		}
		
		// Print set to screen
		System.out.println("Members of the Hales Family, in no particular order:  \n" + halesFamily);
		System.out.println();
	}
	
	// Check for errors while loading members into set
	catch(Exception e) {
		
		System.out.println("Failed to add family members. \n");
	}
	
	
	// Add members to set
	try {
		System.out.println("Attempting to add parents to the Hales Family...");
		
		halesFamily.add("Marvin");
		halesFamily.add("Robin");
		
		System.out.println("Displaying updated family set...\n" + halesFamily);
		System.out.println();
		
	}
	// Check for errors while adding new members to set
	catch (Exception e) {
		
		System.out.println("Failed to add parents. \n");
	}
	
	// Remove members from set
	try {
		System.out.println("Attempting to remove unruly children from the Hales Family... \n");
		
		halesFamily.remove("Jill");
		halesFamily.remove("Daniel");
		
		System.out.println("Displaying new and improved family set...\n" + halesFamily);
		System.out.println();
		
	}
	
	// Check for errors while removing members from set
	catch (Exception e) {
		
		System.out.println("Unable to improve family set. \n");
	}
}
}
