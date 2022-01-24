package day22;

public class Question6 {
	
	public boolean endsWithNG(String strOne) {
		
		//using result keyword because non void return type
		//default result for boolean is false
		boolean result = false;
		
		//check if string parameter is null first
		if (strOne != null) {
	
			//if strOne is not null then check if it ends with "ng"
			//if it does then result is true
			result = strOne.endsWith("ng");
			
		}
		
		//default return result is false
		return result;
		
	}
	
		public static void main(String[] args) {
			
			//accessing non static method by creating object
			Question6 obj = new Question6();
			
			boolean outcomeOne = obj.endsWithNG(null);
			System.out.println(outcomeOne);
			
			boolean outcomeTwo = obj.endsWithNG("I like to practice");
			System.out.println(outcomeTwo);
			
			boolean outcomeThree = obj.endsWithNG("Everyone is practicing");
			System.out.println(outcomeThree);
			
			boolean outcomeFour = obj.endsWithNG("I am studying");
			System.out.println(outcomeFour);
			
		}
	

}
