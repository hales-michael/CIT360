package jsondemo;

import org.json.simple.JSONObject;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.parser.*;
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.io.FileReader; 

public class JSONmain {

	public static void main(String[] args) throws Exception {
		
		String name;
		String jobTitle;
		String dept;
		int yearsEmployed;
		float payRate;
		JSONObject obj = new JSONObject();
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee's name: ");
		name = input.next();
		
		System.out.println("Enter Employee's job title: ");
		jobTitle = input.next();
		
		System.out.println("Enter Employee's department: ");
		dept = input.next();
		
		System.out.println("Enter Employee's years of employment: ");
		yearsEmployed = input.nextInt();
		
		System.out.println("Enter Employee's rate of pay: ");
		payRate = input.nextFloat();
		
		input.close();
		
		
		System.out.println("Encoding JSON Object...");
		obj = JSONencode(name, jobTitle, dept, yearsEmployed, payRate);
		System.out.println(obj);
		
		saveJSON(obj);
		
		printJSONToScreen();
		
	}
	
// JSON object encoder
	private static JSONObject JSONencode(String empName, String title, String dept, int years, float rate) {

		JSONObject obj = new JSONObject();
		
		obj.put("Name", empName);
		obj.put("Title", title);
		obj.put("Department", dept);
		obj.put("YearsEmployeed", years);
		obj.put("PayRate", rate);
		
		return obj;

	}
	
	// Decode (parse) JSON object and display in alternate order

	private static void saveJSON (JSONObject object) throws FileNotFoundException {
		
		JSONObject obj = object;
		
		PrintWriter pw = new PrintWriter("JSONfile.txt");
		pw.write(obj.toJSONString());
		
		pw.flush();
		pw.close();
		
			
		
//		JSONParser parser = new JSONParser();
//		
//		System.out.println(parser.parse(in))



}
	private static void printJSONToScreen() throws Exception {
		Object object = new JSONParser().parse(new FileReader("JSONfile.txt"));
		JSONObject jo = (JSONObject) object;
		
		String name = (String) jo.get("Name");
		String title = (String) jo.get("Title");
		String dept = (String) jo.get("Department");
		int years = (int) jo.get("YearsEmployed");
		float rate = (float) jo.get("Payrate");
		
		
		System.out.println("Printing Employee Record...\n");
		System.out.println("Employee's Name is " + name);
		System.out.println("Employee's title is " + title);
		System.out.println("Employee's department is " + dept);
		System.out.println("Number of years employed is " + years);
		System.out.println("Employee's pay rate is " + rate);
		

	}
	
	
}
