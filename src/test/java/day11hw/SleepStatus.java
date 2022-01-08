package day11hw;

public class SleepStatus {

	public static void main(String[] args) {

		boolean amISleeping = sleepIn(false, false);
		System.out.println(amISleeping);
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {

		boolean result = false;

		if (isVacation == true || isWeekday == false) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}
