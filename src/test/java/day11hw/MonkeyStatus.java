package day11hw;

public class MonkeyStatus {

	public static void main(String[] args) {

		boolean areWeInTrouble = monkeyTrouble(true, true);
		System.out.println(areWeInTrouble);

		boolean areWeInTrouble2 = monkeyTrouble(true, false);
		System.out.println(areWeInTrouble2);

		boolean areWeInTrouble3 = monkeyTrouble(false, false);
		System.out.println(areWeInTrouble3);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		boolean result = false;

		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {

			result = true;

		} else {

			result = false;
		}

		return result;

	}

}
