package day10hw;

public class Question1 {
	
	public static void main(String [] args) {
		
		calculate (2.0, 4.0,'+');
		calculate (4.0, 2.0,'-');
		calculate (4.0, 2.0, '/');
		calculate (2.0, 4.0,'*');
		
		
	}
	
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		if (mathOperationSign == '+') {
			System.out.println(numOne + numTwo);
			
		} else if (mathOperationSign == '*') {
			System.out.println(numOne * numTwo) ;
			
		} else if (mathOperationSign == '/') {
			System.out.println(numOne / numTwo);
			
		}else if (mathOperationSign == '-') {
			System.out.println(numOne - numTwo);
		}
	
	}

}
