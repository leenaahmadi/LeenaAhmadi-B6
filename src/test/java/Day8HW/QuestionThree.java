package Day8HW;

public class QuestionThree {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for (int number = 20; number <= 30; number++) {

			sum = sum + number;
			count++;

		}

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum/count);

	}
}
