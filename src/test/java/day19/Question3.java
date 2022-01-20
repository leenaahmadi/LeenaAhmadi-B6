package day19;

public class Question3 {
	
	//public access modifier with static method and void return type
	//this method takes two String parameters

	public static void isEqualLength(String strOne, String strTwo) {

		//comparing the length of parameter1 and parameter2
		if (strOne.length() == strTwo.length()) {
			
			//if the above condition is true the two parameters will concat
			//		and print the length of the concated result
			String strConcat = strOne.concat(strTwo);
			System.out.println(strConcat + " " + strConcat.length());

			//checking if paramter1 length is greater than parameter2 length
		} else if (strOne.length() > strTwo.length()) {
			
			//if the above condition is true it will print 
			//		parameter1 in upper case as well as the length
			System.out.println(strOne.toUpperCase() + " " + strOne.length());

		} else {
			//if none of the above conditions are true it will print
			//		paramter2 in lowercase as well as the length
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());
		}
	}
	
	public static void main(String[] args) {
		
		//accessing two static methods in the same class - calling directly
		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
		
		
		
	}

}
