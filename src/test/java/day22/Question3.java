package day22;

public class Question3 {
	
	protected String isThreeEqual (String strOne, char oldChar, char newChar) {
		
		//using result keyword because non void
		//default result is equal to null since using null keyword
		String result = null;
		
		//need to check if String parameter is not null first
		if(strOne != null) {
			
			//last two parameters will replace each other in the String parameter
			result = strOne.replace(oldChar, newChar);
			
		}
		
		//if String paramter is null then it will automatically return null
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//creating a new object to access non static method
		Question3 obj = new Question3();
		
		String outcomeOne = obj.isThreeEqual(null, 'P', 'B');
		System.out.println(outcomeOne);
		
		String outcomeTwo = obj.isThreeEqual("Java Pro", 'P', 'B');
		System.out.println(outcomeTwo);
		
		String outcomeThree = obj.isThreeEqual("Lazy mode", 'm', 'C');
		System.out.println(outcomeThree);
		
		String outcomeFour = obj.isThreeEqual("Training", 'T', ' ');
		System.out.println(outcomeFour);
		
		
		
	}

}
