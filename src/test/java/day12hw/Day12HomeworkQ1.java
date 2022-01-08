package day12hw;

public class Day12HomeworkQ1 {
	
	public static void main(String[] args) {
	
	boolean getResult = posNeg(1, -1, false);
	System.out.println(getResult);
	
	boolean getResult2 = posNeg(-1, 1, false);
	System.out.println(getResult2);
	
	boolean getResult3 = posNeg(-4, -5, true);
	System.out.println(getResult3);

	}

public static boolean posNeg(int numOne, int numTwo, boolean isNegative) {

	boolean result = false;
	
		if ((numOne > 0 || numTwo > 0) && (numOne < 0 || numTwo < 0) && (isNegative == false)) {

			result = true;

		} else if (isNegative == true && numOne < 0 && numTwo < 0) {

			result = true;

		} else {

			result = false;

		}

			return result;
	
		}

	}

