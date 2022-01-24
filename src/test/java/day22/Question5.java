package day22;

public class Question5 {
	
	public static String removeSpace(String strOne) {
		
		//using result keyword because non void return type
		//using null as default
		String result = null;
		
		//need to check that String paramter does not equal null first
		if(strOne != null) {
			
			//if above condition is met it will trim white space around characters
			result = strOne.trim();
		}
		
		//will return the default result if above condition is not met (null)
		return result;
	}

	
	public static void main(String[] args) {
		
		//accessing static method directly
		
		//EXPECTED ERROR BECAUSE OF EXTRA " in requirements
		//removed extra " after null to get the null result and to print my code
		String outcomeOne = removeSpace(null); 
		System.out.println(outcomeOne); 
		
		String outcomeTwo = removeSpace(" Java Training     ");
		System.out.println(outcomeTwo);
		
		String outcomeThree = removeSpace("	I  like  to  practice	");
		System.out.println(outcomeThree);
		
		
	}
}
