package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Controller control = new Controller();
		
		int num1;
		int num2;
		String operation;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ACP Demo \n");
		System.out.println("Please enter the first number: ");
		try {
			num1 = Integer.parseInt(scanner.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("Invalid Entry. Setting first number to 0.");
			num1 = 0;						
		}
		
		System.out.println("Please enter the second number: ");
		try {
			num2 = Integer.parseInt(scanner.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("Invalid Entry. Setting second number to 0.");
			num2 = 0;						
		}		
		
		System.out.println("Please enter the desired operation (+, -, *, /): ");
		operation = scanner.nextLine();
		

		if (num1 < -1) {
			System.out.println("The first number must be greater than or equal to 0.");
			return;
		} else if(num2 <= 0) {
			System.out.println("The second number must be greater than 0.");
			return;
			
		}
		
		System.out.println(num1 + " " + operation + " " + num2 + " = " + control.handleIt(operation, num1, num2));
	
	}

}
