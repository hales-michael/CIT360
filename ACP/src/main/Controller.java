package main;

import java.util.HashMap;

public class Controller {
	
	public static HashMap<String, Operations> operationMap = new HashMap<String, Operations>(); {
		operationMap.put("+", new AddHandler());
		operationMap.put("-", new SubtractHandler());
		operationMap.put("*", new MultiplyHandler());
		operationMap.put("/", new DivideHandler());

	
	}
	
	
	public Controller() {}
	
	public Integer handleIt(String operation, Integer num1, Integer num2) {
		

		Operations doOperation = operationMap.get(operation);
		
		return(doOperation.execute(num1, num2));
		
		
	}

}
