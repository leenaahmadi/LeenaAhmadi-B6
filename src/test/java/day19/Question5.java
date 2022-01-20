package day19;

public class Question5 {
	
	//protected access modifier with String return type and 1 parameter
	protected String toLower(String strOne) {
		
		//result keyword because non void return type
		//converting the parameter to lower case
		String result = strOne.toLowerCase();
		
		//prints out results from above
		System.out.println(result);
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		
		//created a new object because we are access non static method from static method
		Question5 question5 = new Question5();
		question5.toLower("espn");
		question5.toLower("SOCCER");
		question5.toLower("string class");
		
		
		
	}

}
