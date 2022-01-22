package day20;

public class Question8 {
	
	
	public static char getCharacter(String strOne, int indexNum) {
		
		//input result keyword because it is non void
		char result = ' ';
		
		//if the length of strOne exceeds the index number it will print ?
		if(strOne.length() < indexNum) {
			
			System.out.println("?");
			
		} else {
		
			System.out.println(strOne.charAt(indexNum) );

		}
		
		return result;
		
		
		}
	
	
	public static void main(String[] args) {
		
		//calling directly from static method to static method
		getCharacter("java training", 2);
		getCharacter("java training", 5);
		getCharacter("java training", 8);
		getCharacter("java training", 22);
		
			
		}
		
		
	}


