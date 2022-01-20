package day19;

public class Question1 {
		
	//static method with default access modifier and boolean return type
	//Two String parameters
	 static boolean isEqual(String strOne, String strTwo) {

		boolean result = false;

		if (strOne.equals(strTwo)) {

			result = true;

		} else {

			result = false;

		}

		return result;

	}
	

	
	public static void main(String[] args) {
		
		//syntax for accessing static methods in the same class - calling directly
		boolean outcome = isEqual("sdet", "SDET");
		boolean outcome2 = isEqual("testing", "testing");
		boolean outcome3 = isEqual("java", "java");
		boolean outcome4 = isEqual ("java", "java Programming");
		
		System.out.println(outcome);
		System.out.println(outcome2);
		System.out.println(outcome3);
		System.out.println(outcome4);
		


	}

}
	
	

