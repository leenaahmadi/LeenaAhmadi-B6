package day11hw;

public class DoubleTotal {
	
	public static void main(String[] args) {
		
		int myTotal = sumDouble(1,2);
		System.out.println(myTotal);
		
		int myTotal2 = sumDouble(3,2);
		System.out.println(myTotal2);
		
		int myTotal3 = sumDouble(2,2);
		System.out.println(myTotal3);
		
		
	}
	
	public static int sumDouble(int valueOne, int valueTwo) {
		
		int result = 0;
		
		if( valueOne != valueTwo) {
			result = valueOne + valueTwo;
			
		} else if (valueOne == valueTwo) {
			result = (valueOne + valueTwo) * 2;
		}
		
		return result;
	}

}
