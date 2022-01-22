package day20;

public class Question14 {
	
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		String result = str.substring(startingIndex, endingIndex);
		
		System.out.println(result);
				
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//calling method directly because accessing static method
		
		//error in requirement output
		//java is correct, requirement specifications are incorrect for first output
		getSubStr("java training", 2, 6); 
		
		getSubStr("Software Development Engineer in TEST", 11, 23);
		
		getSubStr("Software Development Engineer in TEST", 21, 29);
		
	}

}
