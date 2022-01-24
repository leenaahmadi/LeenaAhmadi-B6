package day22;

public class Question4 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		//default result is null because using non void return type
		String result = null;

		//need to check that String parameter does not equal null first
		if (str != null) {
			
			//substring will give the letters between the index numbers provided
			result = str.substring(startingIndex, endingIndex);

		}
		
		//if String parameter is null it will return null result
		return result;

	}
	
	public static void main(String[] args) {
		
		//accessing static method directly
		String outcomeOne = getSubStr(null, 2, 6);
		System.out.println(outcomeOne);
		
		//Outcome in requirements are wrong, java is right
		String outcomeTwo = getSubStr("java training", 2, 6);
		System.out.println(outcomeTwo); 
		
		String outcomeThree = getSubStr("Software Development Engineer in TEST", 11, 23);
		System.out.println(outcomeThree);
		
		String outcomeFour = getSubStr("Software Development Engineer in TEST", 21, 29);
		System.out.println(outcomeFour);
		
	}

}
