package day19;

public class Question6 {
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		
		//making first parameter lower case
		String result = strOne.toUpperCase();
		
		//making third parameter upper case
		String result2 = strThree.toUpperCase();
		
		//making second parameter lower case
		String result3 = strTwo.toLowerCase();
		
		//making fourth parameter lower case
		String result4 = strFour.toLowerCase();
		
		//concatenating all the above results in order
		String result5 = result.concat(result3) + result2.concat(result4);
		
		//printing the result of all of the steps above
		System.out.println(result5);
		
		return result;
		
		
	}

	public static void main(String[] args) {
		
		//directly calling the method because both methods are static
		
		combineStr("day", "ONE", "work", "HOURS");
		combineStr("week", "weekend", "monday", "Tuesday");
		combineStr("restoN", "vA", "baltiMORE", "MD");
		combineStr("java", "is", "fun", "LEARNING");
		
		
		
	}
}
