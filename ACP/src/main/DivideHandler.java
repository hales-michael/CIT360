package main;


public class DivideHandler implements Operations {
	
	public Integer execute(Integer num1, Integer num2) {
		Integer quotient = num1 / num2;
		return quotient;
	}
}
