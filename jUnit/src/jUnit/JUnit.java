package jUnit;

public class JUnit {
	
	public static int add (int num1, int num2) {
		int a = num1;
		int b = num2;
		
		return a + b;
		
	}
	
	public static int sub (int num1, int num2) {
		int a = num1;
		int b = num2;
		
		return a - b;
	}
		
	public static int mult (int num1, int num2) {
		int a = num1;
		int b = num2;
		
		return a * b;
	}
		
	public static int div (int num1, int num2) {
		int a = num1;
		int b = num2;
		
		if (b == 0) {
			return 0;
		} else {
		return a / b;}
	}
		
		
}
