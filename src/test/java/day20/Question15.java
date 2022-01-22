package day20;

public class Question15 {
	
	public static String removeSpace(String strOne) {
		
		//return result because using non void return type
		String result = strOne.trim();
		
		System.out.println(result);
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//calling directly from another static method
		removeSpace(" Java training    ");
		removeSpace(" i   like  to  practice      ");
		
	}

}
