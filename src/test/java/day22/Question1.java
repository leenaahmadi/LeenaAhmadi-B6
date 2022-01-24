package day22;

public class Question1 {
	
	String toUpper(String strOne) {
		
		//using result because non void
		//would like to return null if condition is not met
		String result = null;
		
		//before doing any operation we need to check if the parameter is not null
		//if the parameter does not equal null then it will turn parameter to upper case
		if (strOne != null) {
			
			result = strOne.toUpperCase();
		
		}
		//if the condition above is not met then it will return the default result of null
		return result;
	}
	
	public static void main(String[] args) {
		
		//created a new object because accessing non static method
		Question1 obj = new Question1();
		
			String outcomeOne = obj.toUpper("Pro");
			System.out.println(outcomeOne);
			
			String outcomeTwo = obj.toUpper("Learning");
			System.out.println(outcomeTwo);
			
			String outcomeThree = obj.toUpper(null);
			System.out.println(outcomeThree);
		
	}

}
