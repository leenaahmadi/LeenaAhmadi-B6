package day22;

public class Question2 {
	
	boolean isEndWith (String strOne, String strTwo) {
		
		//non void method so must use result keyword
		boolean result = false;
		
		//need to verify parameters are not null first
		if (strOne != null && strTwo != null) {
			
			//if the above condition is met it will check if strTwo matches with end of strOne
			result = strOne.endsWith(strTwo);
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//created an object due to accessing non static method
		Question2 obj = new Question2();
		
		boolean outcomeOne = obj.isEndWith("java training", "ing");
		System.out.println(outcomeOne);
		
		boolean outcomeTwo = obj.isEndWith("java training", "ng");
		System.out.println(outcomeTwo);
		
		boolean outcomeThree = obj.isEndWith("java training", "java");
		System.out.println(outcomeThree);
		
		boolean outcomeFour = obj.isEndWith("java training", "train");
		System.out.println(outcomeFour);
		
		boolean outcomeFive = obj.isEndWith(null, "java");
		System.out.println(outcomeFive);
		
		boolean outcomeSix = obj.isEndWith(null, null);
		System.out.println(outcomeSix);
		
		boolean outcomeSeven = obj.isEndWith("aaabc", "abc");
		System.out.println(outcomeSeven);
		
		boolean outcomeEight = obj.isEndWith("abc", null);
		System.out.println(outcomeEight);
		
		
		
	}

}
