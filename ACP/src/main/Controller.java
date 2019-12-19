package main;

import java.util.HashMap;

public class Controller {
	
	public static HashMap<String, Operations> operationMap = new HashMap<String, Operations>();
	
	public Controller() {}
	
	public Integer handleIt(String operation, Integer num1, Integer num2) {
		
		operationMap.put("+", new AddHandler());
		operationMap.put("-", new SubtractHandler());
		operationMap.put("*", new MultiplyHandler());
		operationMap.put("/", new DivideHandler());
		
		Operations doOperation = operationMap.get(operation);
		
		return(doOperation.execute(num1, num2));
		
		
	}

}
