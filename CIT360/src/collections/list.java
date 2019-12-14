package collections;
import java.util.ArrayList;

public class list {
	static ArrayList<String> movies = new ArrayList<String>();
	
	// comment
	public list() {
		movies.add("Lord of the Rings");
		movies.add("The Matrix");
		movies.add("Moana");
		movies.add("Star Trek XVII: The Search for William Shatner's Teeth");
		movies.add("Charlie and the Pizza Factory");
	
	}	
	
	public static void displayMovieList() {
		
		System.out.println("Movie List: \n");

		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
	}
	



	public static void listOperations() {
		
		System.out.println();
		System.out.println("The fourth movie in the list is \"" + movies.get(3) + "\"");
		
		System.out.println();
		System.out.println("Removing \"Moana\"...\n");
		deleteMovie(2);
		displayMovieList();
		
		System.out.println();
		System.out.println("Adding movie \"Princess Bride 2: 37% More Inconceivable\"...");
		addMovie("Princess Bride 2: 37% More Inconceivable");
		displayMovieList();
	}
		
	public static void deleteMovie(int index) {
		
		movies.remove(index);
	}
		
	public static void addMovie(String name) {
		
		movies.add(name);
	}
	
public static void main(String[] args) {
	new list();
	displayMovieList();
	listOperations();
	
}
	
}
