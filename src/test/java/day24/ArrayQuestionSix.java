package day24;

public class ArrayQuestionSix {
	
	protected static boolean checkNum(int[] number) {
		
		boolean result = false;
		
		for (int i = 0; i < number.length; i++) {
						
			for (int a = i + 1; a < number.length; a++) {
					
					if (number[i] == 2 && number[a] == 2 || number[i] == 5 && number[i] == 5) {
						
						result = true;
					}
					
				}
			
			
		}
	
		return result;
		
	} 
	
		public static void main(String[] args) {
			
			int n1[] = {6, 1, 2, 3};
			boolean resultOne = checkNum(n1);
			System.out.println(resultOne);
			
			int n2[] = {13, 2, 3, 4, 6, 1, 2, 3};
			boolean resultTwo = checkNum(n2);
			System.out.println(resultTwo);
			
			int n3[] = {3, 3, 0, 1, 4, 3, 6};
			boolean resultThree = checkNum(n3);
			System.out.println(resultThree);
			
			int n4[] = {2, 6, 2};
			boolean resultFour = checkNum(n4);
			System.out.println(resultFour);
	
		}

}
