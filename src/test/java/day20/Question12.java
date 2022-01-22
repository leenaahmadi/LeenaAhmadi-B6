package day20;

public class Question12 {
	
	public static void replaceStr(String strOne, String oldStr, String newStr) {
		
		//initializing variable using default ""
		String replaceStr = "";
				
		System.out.println(replaceStr.replace(oldStr, newStr));
			
	
	}
	
	public static void main(String[] args) {
		
		//accessing static method directly
		replaceStr("I cannot do it", "cannot", "can");
		
	}

}
