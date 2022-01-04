package day10hw;

public class Question2 {

	public static void main(String[] args) {

		getGender('m');
		getGender('M');
		getGender('f');
		getGender('F');
		getGender('E');

	}

	public static void getGender(char gender) {

		if (gender == 'F') {
			System.out.println("Female");

		} else if (gender == 'f') {
			System.out.println("Female");

		} else if ((gender == 'm') || (gender == 'M')) {
			System.out.println("Male");

		} else {
			System.out.println("Error");
		}

	}

}
