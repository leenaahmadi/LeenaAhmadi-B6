package day10hw;

public class Question3 {
	
	public static void main(String[] args) {
		
		oddEven(6);
		oddEven(7);
		
	}
	
	public static void oddEven(int number) {
		
		if ((number % 2 == 0)){
			
			System.out.println("The number is an even number");
			
		} else {
			
			System.out.println("The number is an odd number");
			
		}
		
	}

}
