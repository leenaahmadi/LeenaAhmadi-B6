package Day8HW;

public class Hurricane {
	
	public static void main(String[] args) {

	for (int i = 20; i <= 200; i++) {

		if (i >= 74 && i <= 95) {
			System.out.println("Category 1 Hurricane " + "Wind Speed: " + i);
			break;
		}

		else if (i >= 105 && i <= 110) {
			System.out.println("Category 2 Hurricane " + "Wind Speed: " + i);
			break;

		}

		else if (i >= 120 && i <= 130) {
			System.out.println("Category 3 Hurricane " + "Wind Speed: " + i);
			break;

		}

		else if (i >= 140 && i <= 155) {
			System.out.println("Category 4 Hurricane " + "Wind Speed: " + i);
			break;
		}

		else if (i >= 165 && i <= 194) {
			System.out.println("Category 5 Hurricane " + "Wind Speed: " + i);
			break;
		}

		else {
			System.out.println("Does not qualify as a hurricane");
			

		}

	}
}

}

