package day19;

public class Question9 {
	
	//private access modifier with boolean return type and two Stringparameters
	private boolean isThere(String strOne, String value) {
		
		//default for boolean result is false
		boolean result = false;
		
		//if the first parameter contains the sequence of characters in parameter2 then it will 
		//		print true
		
		if (strOne.contains(value)) {
			result = true;
			System.out.println(result);
		
		//if it does not meet first requirement it will print false
		} else {
			result = false;
			System.out.println(result);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//creating a new object because we are accessing non static method
		Question9 obj = new Question9();
		
		obj.isThere("java training", "ini");
		obj.isThere("java training", "ava");
		obj.isThere("java training", "AVA");
		obj.isThere("java training", "Java");
	}

}
