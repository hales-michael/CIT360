package collections;

import java.util.*;

public class tree {

	public static void main(String[] args) {
		
		TreeSet<String> studentList = new TreeSet<String>();
		
		// Load sorted set in a random order
		studentList.add("Adam");
		studentList.add("Sally");
		studentList.add("Joe");
		studentList.add("Chloe");
		studentList.add("Derick");
		studentList.add("Mark");
		studentList.add("Chris");
		studentList.add("Diane");

		System.out.println("Displaying sorted student list....\n" + studentList);
		System.out.println();
		
		// Add new students John, Ed, and Carlos
		studentList.add("John");
		studentList.add("Ed");
		studentList.add("Carlos");
		
		System.out.println("Displaying updated student list....\n" + studentList);
		System.out.println();
		
		// Remove students Mark and Joe
		studentList.remove("Mark");
		studentList.remove("Joe");
		
		System.out.println("Displaying updated student list....\n" + studentList);
		System.out.println();
		
		// Attempt to add a student that is already in the list
		
		System.out.println("Attemping to add new student named Derick.");
		
		String newStudent = "Derick";
		if (studentList.contains(newStudent)) {
			System.out.println(newStudent + " is already in the list. \n");
			System.out.println("Displaying current student list....\n" + studentList);
			System.out.println();
		} else {
			System.out.println("Displaying updated student list....\n" + studentList);
			System.out.println();
		}		
			
	}

}
