package day20;

public class Question11 {

	//protected access modifier with String return type and 3 parameters
	protected String threeEqual(String str, char oldChar, char newChar) {
		
		//use return keyword because non void
		String result = "";
		
		
		result = str.replace(oldChar, newChar);
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		//creating an object because accessing non static method
		Question11 obj = new Question11();
		
		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		System.out.println(resultOne);
		
		String resultTwo = obj.threeEqual("Lazy mode", 'm', 'C');
		System.out.println(resultTwo);
		
		String resultThree = obj.threeEqual("Training", 'T', ' ');
		System.out.println(resultThree);
		
	}
}
