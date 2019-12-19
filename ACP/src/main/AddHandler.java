package main;


public class AddHandler implements Operations {
	
	public Integer execute(Integer num1, Integer num2) {
		Integer sum = num1 + num2;
		return sum;
	}
}
