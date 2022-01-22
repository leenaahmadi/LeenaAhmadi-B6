package day20;

public class Question13 {
	
	//default access modifier with boolean return type and 2 String parameters
	boolean isStartWith(String strOne, String strTwo) {
		
		//default boolean result is false
		boolean result = false;
		
		if(strOne.startsWith(strTwo)) {
			
			result = true;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//creating an object because accessing a non static method
		Question13 obj = new Question13();
		
		boolean resultOne = obj.isStartWith("java training", "ing");
		System.out.println(resultOne);
		
		boolean resultTwo = obj.isStartWith("java training", "ja");
		System.out.println(resultTwo);
		
		boolean resultThree = obj.isStartWith("java training", "java");
		System.out.println(resultThree);
		
		boolean resultFour = obj.isStartWith("java training", "train");
		System.out.println(resultFour);
	}

}
