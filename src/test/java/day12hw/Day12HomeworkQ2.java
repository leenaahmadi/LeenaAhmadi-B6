package day12hw;

public class Day12HomeworkQ2 {

	public static void main(String[] args) {

		boolean getResult = multipleOf(3);
		System.out.println(getResult);

		boolean getResult2 = multipleOf(10);
		System.out.println(getResult2);

		boolean getResult3 = multipleOf(8);
		System.out.println(getResult3);

	}

	public static boolean multipleOf(int numValue) {

		boolean result = false;

		if ((numValue % 3 == 0 || numValue % 5 == 0) && (numValue >= 0)) {
			result = true;

		} else {
			result = false;

		}

		return result;

	}

}
