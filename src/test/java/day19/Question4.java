package day19;

public class Question4 {
		
	//default, String return type, with 1 parameter
		String toUpper(String strOne) {
			
			//using result keyword because nonvoid return type
			String result;
			
			//converts parameter to upper case letters using toUpperCase method
				result = strOne.toUpperCase();
				
			//prints result
				System.out.println(result);
				
				return result;
			
		}

		public static void main(String[] args) {
			
			//creating new object for class because accessing non static 
			//		method from this static method
			
			Question4 obj = new Question4();
			obj.toUpper("Pro");
			obj.toUpper("java");
			obj.toUpper("java training");
			
		}
		
	}


